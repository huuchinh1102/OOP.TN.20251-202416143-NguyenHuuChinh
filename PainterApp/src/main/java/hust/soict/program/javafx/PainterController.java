package hust.soict.program.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        // Xóa toàn bộ hình vẽ trên Pane
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        // Tạo một hình tròn mới tại vị trí chuột
        // Bán kính: 4, Màu: Đen
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        
        // Thêm hình tròn vào Pane
        drawingAreaPane.getChildren().add(newCircle);
    }
}