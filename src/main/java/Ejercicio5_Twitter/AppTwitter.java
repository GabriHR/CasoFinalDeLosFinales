    package Ejercicio5_Twitter;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.util.Calendar;
    import java.util.Date;
    import java.util.Timer;
    import java.util.TimerTask;

    public class AppTwitter {
        public static void main(String[] args) {
            UserAccount user1 = new UserAccount("user1", new Email("user1@example.com"));
            UserAccount user2 = new UserAccount("user2", new Email("user2@example.com"));

            JTextArea tweetText = new JTextArea();  // Mover la creación del JTextArea fuera del bucle

            JFrame mainFrame = new JFrame("AppTwitter");
            mainFrame.setSize(1200, 800);
            mainFrame.setLocationRelativeTo(null);  // Centrar la ventana

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1;
            gbc.weighty = 1;

            JButton followButton = new JButton("Seguir a un usuario");
            JButton tweetButton = new JButton("Publicar un tweet");
            JButton directMessageButton = new JButton("Enviar mensaje directo");  // Nuevo botón
            JButton viewTimelineButton = new JButton("Ver timeline");
            JButton exitButton = new JButton("Salir");

            followButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    user1.follow(user2);
                    JOptionPane.showMessageDialog(null, "user1 ahora está siguiendo a user2", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            tweetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame tweetFrame = new JFrame("Publicar un tweet");
                    tweetFrame.setSize(400, 400);
                    tweetFrame.setLocationRelativeTo(null); // Centrar la ventana

                    JButton postTweetButton = new JButton("Tweet");
                    JButton scheduleTweetButton = new JButton("Programar tweet");

                    JPanel panel = new JPanel();
                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                    panel.add(new JLabel("Texto del tweet:"));
                    panel.add(tweetText);
                    panel.add(postTweetButton);
                    panel.add(scheduleTweetButton);

                    postTweetButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Tweet tweet = new Tweet(tweetText.getText());
                            user1.tweet(tweet);
                            JOptionPane.showMessageDialog(null, "user1 ha publicado un tweet", "Información", JOptionPane.INFORMATION_MESSAGE);
                            tweetFrame.dispose();
                        }
                    });

                    scheduleTweetButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JFrame scheduleFrame = new JFrame("Programar tweet");
                            scheduleFrame.setSize(400, 400);
                            scheduleFrame.setLocationRelativeTo(null); // Centrar la ventana

                            SpinnerNumberModel dayModel = new SpinnerNumberModel(1, 1, 31, 1);
                            SpinnerNumberModel monthModel = new SpinnerNumberModel(1, 1, 12, 1);
                            SpinnerNumberModel yearModel = new SpinnerNumberModel(2024, 2024, 2026, 1);
                            SpinnerNumberModel hourModel = new SpinnerNumberModel(0, 0, 23, 1);
                            SpinnerNumberModel minuteModel = new SpinnerNumberModel(0, 0, 59, 1);

                            JSpinner daySpinner = new JSpinner(dayModel);
                            JSpinner monthSpinner = new JSpinner(monthModel);
                            JSpinner yearSpinner = new JSpinner(yearModel);
                            JSpinner hourSpinner = new JSpinner(hourModel);
                            JSpinner minuteSpinner = new JSpinner(minuteModel);

                            JButton confirmButton = new JButton("Confirmar");
                            confirmButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent actionEvent) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.set(Calendar.DAY_OF_MONTH, (Integer) daySpinner.getValue());
                                    calendar.set(Calendar.MONTH, (Integer) monthSpinner.getValue() - 1);
                                    calendar.set(Calendar.YEAR, (Integer) yearSpinner.getValue());
                                    calendar.set(Calendar.HOUR_OF_DAY, (Integer) hourSpinner.getValue());
                                    calendar.set(Calendar.MINUTE, (Integer) minuteSpinner.getValue());

                                    Date scheduleDate = calendar.getTime();
                                    Tweet tweet = new Tweet(tweetText.getText());
                                    Timer timer = new Timer();
                                    timer.schedule(new TimerTask() {
                                        @Override
                                        public void run() {
                                            user1.tweet(tweet);
                                            JOptionPane.showMessageDialog(null, "user1 ha publicado un tweet programado", "Información", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }, scheduleDate);
                                    JOptionPane.showMessageDialog(null, "Tweet programado: " + scheduleDate, "Información", JOptionPane.INFORMATION_MESSAGE);
                                    scheduleFrame.dispose();
                                    tweetFrame.dispose();
                                    main(args); // Volver a abrir el menú principal
                                }
                            });

                            JPanel schedulePanel = new JPanel();
                            schedulePanel.setLayout(new BoxLayout(schedulePanel, BoxLayout.Y_AXIS));
                            schedulePanel.add(new JLabel("Día:"));
                            schedulePanel.add(daySpinner);
                            schedulePanel.add(new JLabel("Mes:"));
                            schedulePanel.add(monthSpinner);
                            schedulePanel.add(new JLabel("Año:"));
                            schedulePanel.add(yearSpinner);
                            schedulePanel.add(new JLabel("Hora:"));
                            schedulePanel.add(hourSpinner);
                            schedulePanel.add(new JLabel("Minuto:"));
                            schedulePanel.add(minuteSpinner);
                            schedulePanel.add(confirmButton);

                            scheduleFrame.getContentPane().add(schedulePanel, BorderLayout.CENTER);
                            scheduleFrame.setVisible(true);
                        }
                    });

                    tweetFrame.getContentPane().add(panel, BorderLayout.CENTER);
                    tweetFrame.setVisible(true);
                }
            });

            viewTimelineButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StringBuilder timeline = new StringBuilder("Timeline de user1:\n");
                    for (Tweet tweetInTimeline : user1.getTimeline()) {
                        timeline.append(tweetInTimeline.getText()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, timeline.toString(), "Timeline", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            directMessageButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame dmFrame = new JFrame("Enviar mensaje directo");
                    dmFrame.setSize(400, 400);
                    dmFrame.setLocationRelativeTo(null);  // Centrar la ventana

                    JButton postDMButton = new JButton("Enviar DM");

                    JPanel panel = new JPanel();
                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                    panel.add(new JLabel("Texto del mensaje:"));
                    panel.add(tweetText);
                    panel.add(postDMButton);

                    postDMButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            DirectMessage dm = new DirectMessage(tweetText.getText(), user1, user2);
                            user1.sendDirectMessage(dm);
                            JOptionPane.showMessageDialog(null, "user1 ha enviado un mensaje directo a user2", "Información", JOptionPane.INFORMATION_MESSAGE);
                            dmFrame.dispose();
                        }
                    });

                    dmFrame.getContentPane().add(panel, BorderLayout.CENTER);
                    dmFrame.setVisible(true);
                }
            });

            buttonPanel.add(followButton, gbc);
            buttonPanel.add(tweetButton, gbc);
            buttonPanel.add(directMessageButton, gbc);  // Añadir el nuevo botón al panel
            buttonPanel.add(viewTimelineButton, gbc);
            buttonPanel.add(exitButton, gbc);

            JPanel mainPanel = new JPanel(new GridBagLayout());
            GridBagConstraints mainGbc = new GridBagConstraints();
            mainGbc.gridwidth = GridBagConstraints.REMAINDER;
            mainGbc.fill = GridBagConstraints.BOTH;
            mainGbc.weightx = 1;
            mainGbc.weighty = 1;

            mainGbc.weightx = 0;  // Reset weightx so buttonPanel doesn't take up extra horizontal space
            mainPanel.add(buttonPanel, mainGbc);
            mainPanel.add(new JPanel(), mainGbc);  // Empty panel to take up right half of space

            mainFrame.getContentPane().add(mainPanel);
            mainFrame.setVisible(true);
        }
    }