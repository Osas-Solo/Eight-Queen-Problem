import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class EightQueenPositionGenerator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Scene scene;
    BorderPane windowContent;
    GridPane board;
    ImageView[] queens;
    VBox bottomContent;
    Button generate;
    Label waitText;
    Alert wait;
    static int queenRows[];
    static int queenColumns[];

    @Override
    public void start(Stage primaryStage) {

        windowContent = new BorderPane();
        windowContent.setStyle("-fx-background: #eddd9e;" +
                                "-fx-font-family: Verdana, Arial, sans-serif;" +
                                "-fx-padding: 20px 25px");

        // centre content
        board = new GridPane();
        board.setAlignment(Pos.CENTER);
        board.setGridLinesVisible(false);
        queens = new ImageView[8];
        for (int i = 0; i < 8; i++) {
            queens[i] = new ImageView();
            queens[i].setFitWidth(50);
            queens[i].setFitHeight(50);
        }
        for (int i = 0; i < 8; i++) {
            GridPane.setConstraints(queens[i], i, i);
        }
        board.getChildren().addAll(queens);
        board.setPrefSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);
        board.setBackground(new Background(new BackgroundImage(new Image("chess_board.png"),
                                                        null, null, null,
                                                                new BackgroundSize(100,100,
                                                                        true,true,
                                                                        true, true))));
        windowContent.setCenter(board);

        //  bottom content
        bottomContent = new VBox();
        bottomContent.setAlignment(Pos.CENTER);
        waitText = new Label();
        waitText.setStyle("-fx-text-fill: #000033;" +
                            "-fx-font-size: 16;");
        generate = new Button("Generate");
        generate.setStyle("-fx-background-color: #000033;" +
                            "-fx-text-fill: #eddd9e;" +
                            "-fx-font-weight: bold;");
        generate.setDefaultButton(true);
        bottomContent.getChildren().addAll(waitText, generate);
        windowContent.setBottom(bottomContent);

        //  wait alert
        wait = new Alert(Alert.AlertType.INFORMATION);
        wait.setTitle("Wait");
        wait.setHeaderText(null);
        wait.setContentText("Please wait while the positions are been generated");

        //  create window
        scene = new Scene(windowContent, 440, 470);
        primaryStage.setTitle("Eight Queen Position Generator");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        queenRows = new int[8];  //  queen row
        queenColumns = new int[8];  //  queen column

        generate.setOnAction(e -> {
            for (int i = 0; i < 8; i++) {
                queens[i].setVisible(false);
            }
            waitText.setText("Please wait, this may take several minutes");
            wait.showAndWait();
            generate.setDisable(true);
            generatePositions();
            waitText.setText("");
            //  display queen positions on the board
            for (int i = 0; i < 8; i++) {
                queens[i] = new ImageView("chess_queen.png");
                queens[i].setVisible(true);
                queens[i].setFitWidth(50);
                queens[i].setFitHeight(50);
                GridPane.setConstraints(queens[i], queenColumns[i] - 1, queenRows[i] - 1);
            }
            board.getChildren().addAll(queens);
            generate.setDisable(false);
        });

    }  //  end of start

    public static void generatePositions() {

        boolean constraintMet = false;

        while (!constraintMet) {
            EightQueenSolution.guessPositions(queenRows, queenColumns);
            constraintMet = EightQueenSolution.checkPositions(queenRows, queenColumns);
        }

    }  //  end of generatePositions

}  //  end of class