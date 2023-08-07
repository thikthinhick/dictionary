package com.example.dictionary;

import java.net.URISyntaxException;
import java.net.URL;

public class HelloApplication {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
//        stage.setTitle("Từ điển");
//        stage.setScene(scene);
//        stage.show();
//    }

    public static void main(String[] args) throws URISyntaxException {
        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline();
        dictionaryCommandline.dictionryAdvanced();
    }
}