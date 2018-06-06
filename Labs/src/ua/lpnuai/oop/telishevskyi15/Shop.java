package sample;


import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Shop
        extends Application {

    private TableView<Product> table;
    private ObservableList<Product> data;
    private Text actionStatus;

    public static void main(String [] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Cadre Agency");

        //* Products label
        Label label = new Label("Cadre Agency");
        label.setTextFill(Color.BLACK);
        label.setFont(Font.font("cursive", FontWeight.SEMI_BOLD, 38));
        HBox labelHb = new HBox();
        labelHb.setAlignment(Pos.TOP_LEFT);
        labelHb.getChildren().add(label);

        // Table view, data, columns and properties

        table = new TableView<>();
        data = getInitialTableData();
        table.setItems(data);
        table.setEditable(true);

        TableColumn idCol = new TableColumn("Id");
        idCol.setCellValueFactory(new PropertyValueFactory<Product, String>("id"));
        idCol.setCellFactory(TextFieldTableCell.forTableColumn());
        idCol.setOnEditCommit(new EventHandler<CellEditEvent<Product, String>>() {
            @Override
            public void handle(CellEditEvent<Product, String> t) {

                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setId(t.getNewValue());
                actionStatus.setText(((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).toString());
                table.refresh();
            }
        });

        TableColumn spec_expCol = new TableColumn("Speciality\nexpirience");
        spec_expCol.setCellValueFactory(new PropertyValueFactory<Product, String>("spec_expiren"));
        spec_expCol.setCellFactory(TextFieldTableCell.forTableColumn());
        spec_expCol.setOnEditCommit(new EventHandler<CellEditEvent<Product, String>>() {
            @Override
            public void handle(CellEditEvent<Product, String> t) {

                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setSpec_expiren(t.getNewValue());
                actionStatus.setText(((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).toString());
                table.refresh();
            }
        });

        TableColumn educationCol = new TableColumn("Education");
        educationCol.setCellValueFactory(new PropertyValueFactory<Product, String>("education"));
        educationCol.setCellFactory(TextFieldTableCell.forTableColumn());
        educationCol.setOnEditCommit(new EventHandler<CellEditEvent<Product, String>>() {
            @Override
            public void handle(CellEditEvent<Product, String> t) {

                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setEducation(t.getNewValue());
                actionStatus.setText(((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).toString());
                table.refresh();
            }
        });

        TableColumn dateCol = new TableColumn("Employement period");
        dateCol.setCellValueFactory(new PropertyValueFactory<Product, String>("data"));
        dateCol.setCellFactory(TextFieldTableCell.forTableColumn());
        dateCol.setOnEditCommit(new EventHandler<CellEditEvent<Product, String>>() {
            @Override
            public void handle(CellEditEvent<Product, String> t) {

                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setData(t.getNewValue());
                actionStatus.setText(((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).toString());
                table.refresh();
            }
        });
       /*
        TableColumn newspecCol = new TableColumn("New speciality");
        newspecCol.setCellValueFactory(new PropertyValueFactory<Product, String>("newspeciality"));
        newspecCol.setCellFactory(TextFieldTableCell.forTableColumn());
        newspecCol.setOnEditCommit(new EventHandler<CellEditEvent<Product, String>>() {
            @Override
            public void handle(CellEditEvent<Product, String> t) {

                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setNewSpeciality(t.getNewValue());
                actionStatus.setText(((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).toString());
                table.refresh();
            }
        });*/

        TableColumn moneyCol = new TableColumn("Salary");
        moneyCol.setCellValueFactory(new PropertyValueFactory<Product, String>("salary"));
        moneyCol.setCellFactory(TextFieldTableCell.forTableColumn());
        moneyCol.setOnEditCommit(new EventHandler<CellEditEvent<Product, String>>() {
            @Override
            public void handle(CellEditEvent<Product, String> t) {

                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setSalary(t.getNewValue());
                actionStatus.setText(((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).toString());
                table.refresh();
            }
        });


        table.getColumns().setAll(idCol, spec_expCol, educationCol, dateCol,moneyCol);
        table.setPrefWidth(300);
        table.setPrefHeight(550);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.getSelectionModel().selectedIndexProperty().addListener(
                new RowSelectChangeListener());

        // Add and delete buttons
        Button addbtn = new Button("Add");
        addbtn.setOnAction(new AddButtonListener());
        Button delbtn = new Button("Delete");
        delbtn.setOnAction(new DeleteButtonListener());
        HBox buttonHb = new HBox(10);
        buttonHb.setAlignment(Pos.BOTTOM_LEFT);
        buttonHb.getChildren().addAll(addbtn, delbtn);

        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.WHITE);
        // Vbox
        VBox vbox = new VBox(20);
        vbox.setPadding(new Insets(20, 20, 20, 20));;
        vbox.getChildren().addAll(labelHb, table, buttonHb, actionStatus);

        // Scene
        Scene scene = new Scene(vbox, 820, 700); // w x h
        primaryStage.setScene(scene);
        primaryStage.show();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case TAB:    table.refresh();

                }
            }
        });

        // Select the first row
        table.getSelectionModel().select(0);
        Product product = table.getSelectionModel().getSelectedItem();
        actionStatus.setText(product.toString());

    } // start()

    private class RowSelectChangeListener implements ChangeListener<Number> {

        @Override
        public void changed(ObservableValue<? extends Number> ov,
                            Number oldVal, Number newVal) {

            int ix = newVal.intValue();

            if ((ix < 0) || (ix >= data.size())) {

                return; // invalid data
            }

            Product product = data.get(ix);
            actionStatus.setText(product.toString());
            table.refresh();
        }
    }

    private ObservableList<Product> getInitialTableData() {

        List<Product> list = new ArrayList<>();

        list.add(new Product("1032321", "Designer 1.5 year", "Lviv Politechnic", "12.07.2012", "1200$"));

        ObservableList<Product> data = FXCollections.observableList(list);

        return data;
    }

    private class AddButtonListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            Product product = new Product("", "", "", "", "");
            data.add(product);
            int row = data.size() - 1;

            // Select the new row
            table.requestFocus();
            table.getSelectionModel().select(row);
            table.getFocusModel().focus(row);

        }
    }

    private class DeleteButtonListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {

            // Get selected row and delete
            int ix = table.getSelectionModel().getSelectedIndex();
            Product product = (Product) table.getSelectionModel().getSelectedItem();
            data.remove(ix);
            actionStatus.setText("Deleted: " + product.toString());

            // Select a row

            if (table.getItems().size() == 0) {

                actionStatus.setText("No data in table !");
                return;
            }

            if (ix != 0) {

                ix = ix -1;
            }

            table.requestFocus();
            table.getSelectionModel().select(ix);
            table.getFocusModel().focus(ix);
        }
    }
}