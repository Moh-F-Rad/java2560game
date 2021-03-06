package game;

import javafx.animation.Animation;
import javafx.fxml.FXML;

public class TravelController {

    static int animationDuration = 20;

    /**
     * sets PlayerStats.isMoving() to false,
     * and stops the driving animation
     */
    @FXML
    private void stopMoving(){
        //Main.gang.setMoving(false);
//        Main.PlayerStats.setMoving(false);
//        drivingTransition.stop();
//        updateGUI();
    }


    /**
     * runs the updateGUI() method, starts
     * the driving animation, sets
     * PlayerStats.isMoving() to true, and
     * starts the TravelTask()
     */
    @FXML
    private void setOut(){
//        updateGUI();
//        drivingTransition.play();
//        //Main.gang.setMoving(true);
//        PlayerStats.setMoving(true);
//
//        HealthClass.checkGameOver();
//
//        if (Runtime.getRuntime().availableProcessors() + Main.main.startingThreads > Thread.activeCount()) TravelTask();
    }


//    /**
//     * runs the method that creates a menu scene,
//     * sets Gang.isMoving() to false, and displays
//     * the menu that was created
//     */
//    @FXML
//    private void menu(){
//
//        // Runs mid menu
//        MidGameMenu.menuMethod();
//
//        Main.gang.setMoving(false);
//        Main.main.getMenuWindow().showAndWait();
//    }
//
//    /**
//     * The thread where everything happens
//     * per day, and while run for as long as
//     * Gang.isMoving() is true
//     */
//    private void TravelTask() {
//
//        new Thread(() -> {
//
//            // Run background task(s) here
//            while (Main.gang.isMoving()) {
//
//                final byte sickEventChanceMaxValue = 20;
//                final short distanceBetweenCities = 350;
//                final byte scorePerDay = 25;
//                final short dayLength = 2_400;
//
//                // Setting values
//                Career.payDay();
//
//                Main.main.setSickEventChance(Main.rand.nextInt(sickEventChanceMaxValue)+1);
//                Main.gang.setScore(Main.gang.getScore() + scorePerDay);
//                Main.gang.setDistanceSinceCity((short) (Main.gang.getDistanceSinceCity() + drive(Main.main.determineVehicle())));
//                Main.gang.setDays(Main.gang.getDays() + 1);
//
//                consumeResources();
//                Main.main.checkValues();
//
//                Main.main.saveGameState();
//
//                Platform.runLater(() -> {
//                    // update the JavaFX UI Thread here when the task(s) above are done
//
//                    // city count down
//                    if (Main.gang.getDistanceSinceCity() >= distanceBetweenCities) Main.alert.cityEvent();
//
//                    //Thief encounter
//                    if (Main.Chance((byte)50,(byte)0,(byte)25)) Main.alert.thiefEncounter();
//
//                    // health events
//                    HealthClass.determineHealthCondition();
//
//                    updateGUI();
//                });
//
//                if (!Main.gang.isMoving()) break;
//
//                try {
//                    Thread.sleep(dayLength);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            Platform.runLater(() -> {
//
//                updateGUI();
//                drivingTransition.stop();
//            });
//
//            Main.main.saveGameState();
//
//        }).start();
//    }
//
//    @FXML
//    public void initialize(){
//
//        Main.getAlertWindow().setOnCloseRequest(e -> spriteImage.setImage(new Image(Main.gang.getCarSpriteURL())));
//
//        // updating labels
//        distanceLabel.setText("Travelled: "+ Main.gang.getDistance() +"Mi");
//        conditionsLabel.setText("Health Cond: "+ Main.gang.getHealthConditions());
//        daysLabel.setText("Days: "+ Main.gang.getDays());
//        statusLabel.setText("Status: Resting");
//
//        // setting up how the animation will work
//        drivingTransition = new TranslateTransition();
//        drivingTransition.setDuration(Duration.seconds(animationDuration));
//        drivingTransition.setToX(Main.main.getMainWindow().getWidth() - 850);
//        drivingTransition.setNode(sprite);
//        drivingTransition.setCycleCount(Animation.INDEFINITE);
//    }
//
//    /**
//     * Updates all labels, and the
//     * transition in the Travel scene
//     */
//    @FXML
//    private void updateGUI(){
//
//        spriteImage.setImage(new Image(Main.gang.getCarSpriteURL()));
//
//        // updating labels
//        distanceLabel.setText("Travelled: "+ Main.gang.getDistance() +"Mi");
//        conditionsLabel.setText("Health Cond: "+ Main.gang.getHealthConditions());
//        daysLabel.setText("Days: "+ Main.gang.getDays());
//
//        if (Main.gang.isMoving()) {
//            setOutBtn.setText("Speedup");
//            statusLabel.setText("Status: Moving");
//        } else {
//            setOutBtn.setText("Set out");
//            statusLabel.setText("Status: Resting");
//        }
//    }
//
//    /**
//     * It takes an object that implements
//     * the Vehicle interface and runs the
//     * drive method
//     *
//     * @param v Is the object that
//     *          implements the vehicle
//     *          interface
//     *
//     * @return the value returned by
//     * the object's drive method. This
//     * is the speed of the vehicle that
//     * is used to add to the current
//     * distance
//     */
//    private byte drive(Vehicle v){
//
//        return v.drive();
//    }
//
//    /**
//     * Subtracts Food and water, by the size
//     * of the gang multiplied by
//     * food intake value
//     */
//    private void consumeResources(){
//
//        Main.gang.setFood(Main.gang.getFood() - (Main.gang.getGangMembers().size() * Main.gang.getFoodIntake()));
//        Main.gang.setWater(Main.gang.getWater() - (Main.gang.getGangMembers().size() * Main.gang.getFoodIntake()));
//    }
}
