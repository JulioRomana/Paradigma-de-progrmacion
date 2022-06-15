# Paradigma-de-progrmacion
#### Subgrupo 1_11

## Integrantes
#### Julio Cesar Romaña Caceres (Subgrupo 1_27)
#### Camila Andrea Orjuela Garcia (Subgrupo 1_11)
#### John Edisson Gonzalez Rubiano (Subgrupo 1_27)
#### Cristian Camilo Orjuela Vargas (Subgrupo 1_11)

// Interfaces creadas con JavaFX con SceneBuilder

// Interfaz de Inicio


<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.Cursor?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.effect.Glow?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>


<AnchorPane fx:id="background" prefHeight="397.0" prefWidth="431.0" style="-fx-background-color: #38b8eb;" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/18">
   <effect>
      <Glow />
   </effect>
   <children>
      <ImageView fx:id="cat" fitHeight="133.0" fitWidth="137.0" layoutX="254.0" layoutY="58.0">
         <image>
            <Image url="@../../../../../Downloads/pixlr-bg-result.png" />
         </image>
      </ImageView>
      <Text fx:id="namegame" layoutX="14.0" layoutY="190.0" strokeType="OUTSIDE" strokeWidth="0.0" text="PhoWordto" textAlignment="CENTER" wrappingWidth="397.828125">
         <font>
            <Font name="Rockwell Extra Bold" size="56.0" />
         </font>
      </Text>
      <Button fx:id="buttonstart" layoutX="240.0" layoutY="260.0" mnemonicParsing="false" onAction="#nextAnchorPane" prefHeight="56.0" prefWidth="109.0" style="-fx-background-color: #f55161;" text="START" textAlignment="CENTER" textFill="#110000" textOverrun="CLIP">
         <font>
            <Font name="Rockwell Extra Bold" size="10.0" />
         </font>
         <effect>
            <Glow />
         </effect>
         <cursor>
            <Cursor fx:constant="HAND" />
         </cursor>
      </Button>
   </children>
</AnchorPane>


// Interfaz de Congratulations


<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.Cursor?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.effect.Glow?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>


<AnchorPane fx:id="background" prefHeight="397.0" prefWidth="431.0" style="-fx-background-color: #38b8eb;" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/18">
   <children>
      <AnchorPane layoutX="-118.0" layoutY="-175.0" prefHeight="200.0" prefWidth="200.0" />
      <Text fx:id="congratulations" fill="#e82b2b" layoutX="44.0" layoutY="126.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Congratulations!" wrappingWidth="482.4283924102783">
         <font>
            <Font name="Rockwell Extra Bold" size="41.0" />
         </font>
      </Text>
      <ImageView fx:id="cat2" fitHeight="200.0" fitWidth="200.0" layoutX="169.0" layoutY="103.0">
         <image>
            <Image url="@../../../../../Downloads/pixlr-bg-result%20(1).png" />
         </image>
      </ImageView>
      <Button fx:id="buttonnext" layoutX="339.0" layoutY="288.0" mnemonicParsing="false" prefHeight="49.0" prefWidth="133.0" style="-fx-background-color: #f55161;" text="Next" textAlignment="JUSTIFY">
         <font>
            <Font name="Rockwell Extra Bold" size="14.0" />
         </font>
         <cursor>
            <Cursor fx:constant="HAND" />
         </cursor>
         <effect>
            <Glow />
         </effect>
      </Button>
   </children>
</AnchorPane>


//Interfaz de Game Over


<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.Cursor?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.effect.Glow?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>


<AnchorPane xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/18">
   <children>
      <AnchorPane fx:id="background" layoutX="-35.0" layoutY="-102.0" prefHeight="397.0" prefWidth="431.0" style="-fx-background-color: #38b8eb;" AnchorPane.bottomAnchor="0.0" AnchorPane.leftAnchor="0.0" AnchorPane.rightAnchor="0.0" AnchorPane.topAnchor="0.0">
         <children>
            <ImageView fx:id="cat3" fitHeight="236.0" fitWidth="255.0" layoutX="89.0" layoutY="83.0">
               <image>
                  <Image url="@../../../../../Downloads/pixlr-bg-result%20(2).png" />
               </image>
            </ImageView>
            <Text fx:id="GAMEOVER" layoutX="100.0" layoutY="107.0" strokeType="OUTSIDE" strokeWidth="0.0" text="Game Over">
               <font>
                  <Font name="Rockwell Extra Bold" size="36.0" />
               </font>
            </Text>
            <Button fx:id="buttonnextgameover" layoutX="266.0" layoutY="307.0" mnemonicParsing="false" prefHeight="53.0" prefWidth="122.0" style="-fx-background-color: #f55161;" text="Next" textAlignment="CENTER">
               <font>
                  <Font name="Rockwell Extra Bold" size="14.0" />
               </font>
               <cursor>
                  <Cursor fx:constant="HAND" />
               </cursor>
               <effect>
                  <Glow />
               </effect>
            </Button>
         </children>
      </AnchorPane>
   </children>
</AnchorPane>
