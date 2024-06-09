package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	 @Override
	    public void start(Stage primaryStage) {
	      
	        MenuBar menuBar = new MenuBar();
	        
	       //MENUS PRINCIPALES DE LA BARRA MENU
	        Menu menuArchivo = new Menu("Archivo");
	        Menu menuEditar = new Menu("Editar");
	        Menu menuBuscar = new Menu("Buscar");
	        Menu menuVista = new Menu("Vista");
	        Menu menuLenguaje = new Menu("Lenguaje");

	     
	        //items del menu ARCHIVO
	        MenuItem itemNuevo = new MenuItem("Nuevo");
	        MenuItem itemAbrir = new MenuItem("Abrir");
	        MenuItem itemGuardar = new MenuItem("Guardar");
	        MenuItem itemSalir = new MenuItem("Salir");
	        menuArchivo.getItems().addAll(itemNuevo, itemAbrir, itemGuardar, new SeparatorMenuItem(), itemSalir);

	       //items del menu EDITAR
	        MenuItem itemCortar = new MenuItem("Cortar");
	        MenuItem itemCopiar = new MenuItem("Copiar");
	        MenuItem itemPegar = new MenuItem("Pegar");
	        MenuItem itemInsertar = new MenuItem("Insertar");
	        menuEditar.getItems().addAll(itemCortar, itemCopiar, itemPegar,new SeparatorMenuItem() ,itemInsertar);

	      //items del menu BUSCAR
	        MenuItem itemBuscar = new MenuItem("Buscar...");
	        MenuItem itemBuscarArchivos = new MenuItem("Buscar en Archivos");
	        MenuItem itemBuscarSiguiente = new MenuItem("Buscar siguiente");
	        MenuItem itemBuscarAnterior = new MenuItem("Buscar anterior");
	        menuBuscar.getItems().addAll(itemBuscar, itemBuscarArchivos, itemBuscarSiguiente, new SeparatorMenuItem(),itemBuscarAnterior);
	        
	      //items del menu VISTA
	        MenuItem itemSiempreVisible = new MenuItem("Siempre visible");
	        MenuItem itemPantallaCompleta = new MenuItem("Pantalla completa o no");
	        MenuItem itemEnviar = new MenuItem("Enviar");
	        MenuItem itemZoom = new MenuItem("Zoom");
	        menuVista.getItems().addAll(itemSiempreVisible, itemPantallaCompleta, itemEnviar, new SeparatorMenuItem(),itemZoom );
	        
	        
	      //items del menu LENGUAJE
	        MenuItem itemNormal = new MenuItem("Normal Text");
	        MenuItem itemA = new MenuItem("A");
	        MenuItem itemB = new MenuItem("B");
	        MenuItem itemPredefinidoPorelusuario = new MenuItem("Predefinido Por el usuario");
	        menuLenguaje.getItems().addAll(itemNormal,new SeparatorMenuItem(),itemA,itemB,new SeparatorMenuItem(),itemPredefinidoPorelusuario);
	        
	        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuBuscar, menuVista, menuLenguaje);

	        
	        //Mensajes en consola en realción con las acciones de los botones
	        itemNuevo.setOnAction(e -> System.out.println("Archivo Nuevo Creado"));
	        itemAbrir.setOnAction(e -> System.out.println("Archivo abierto"));
	        itemGuardar.setOnAction(e -> System.out.println("Archivo guardado"));
	        itemSalir.setOnAction(e -> primaryStage.close()); //EL ITEM SALIR CIERRA LA VENTANA DE LA APP
	        
	        itemCortar.setOnAction(e -> System.out.println("Texto cortado correctamente"));
	        itemCopiar.setOnAction(e -> System.out.println("Texto copiado correctamente"));
	        itemPegar.setOnAction(e -> System.out.println("texto pegado correctamente"));
	        itemInsertar.setOnAction(e -> System.out.println("texto insertado correctamente"));
	        
	        itemBuscar.setOnAction(e -> System.out.println("Mostrando Información solicitada"));
	        itemBuscarArchivos.setOnAction(e -> System.out.println("Mostrando Información de Archivo"));
	        itemBuscarSiguiente.setOnAction(e -> System.out.println("Mostrando Información de Archivo Siguiente"));
	        itemBuscarAnterior.setOnAction(e -> System.out.println("Mostrando Información de Archivo Anterior"));
	        
	        itemSiempreVisible.setOnAction(e -> System.out.println("Motrar todo"));
	        itemPantallaCompleta.setOnAction(e -> System.out.println("Mostrando Pantalla completa"));
	        itemEnviar.setOnAction(e -> System.out.println("Enviando"));
	        itemZoom.setOnAction(e -> System.out.println("Haciendo ZOOM"));
	        
	        itemNormal.setOnAction(e -> System.out.println("Presentanto texto normal"));
	        itemA.setOnAction(e -> System.out.println("Mostrando opciones de lenguaje A"));
	        itemB.setOnAction(e -> System.out.println("Mostrando opciones de lenguaje B"));
	        itemPredefinidoPorelusuario.setOnAction(e -> System.out.println("Mostrando opciones para predefinir el lenguaje a usar"));
	        
	        BorderPane root = new BorderPane();
	        root.setTop(menuBar);

	      
	        Scene scene = new Scene(root, 400, 250);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Implementación de sistemas de Menú");
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
}
