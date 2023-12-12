import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class FirstClass extends JFrame {
  private JSplitPane splitPane;
  private JTabbedPane tabbedPane;

  public FirstClass() {
    setTitle("Приобщаемся к искусству");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    initComponents();
    setSize(800, 600);
    setVisible(true);
  }

  private void initComponents() { // Создание дерева в левой части

    DefaultMutableTreeNode node = new DefaultMutableTreeNode("Мои походы в музеи");
    DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("2019");
    DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("2020");
    DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("2021");
    DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("2022");
    node.add(node1);
    node.add(node2);
    node.add(node3);
    node.add(node4);
    DefaultMutableTreeNode one = new DefaultMutableTreeNode("Музей 1");
    DefaultMutableTreeNode two = new DefaultMutableTreeNode("Музей 2");
    DefaultMutableTreeNode three = new DefaultMutableTreeNode("Музей 3");
    DefaultMutableTreeNode four = new DefaultMutableTreeNode("Музей 4");
    DefaultMutableTreeNode five = new DefaultMutableTreeNode("Музей 5");
    DefaultMutableTreeNode six = new DefaultMutableTreeNode("Музей 6");
    node1.add(one);
    node1.add(two);
    node1.add(three);
    node2.add(four);
    node2.add(five);
    node3.add(six); // дерево 
    JTree tree = new JTree(node); 
    tree.setEditable(true); 
    JScrollPane treeScrollPane = new JScrollPane(tree); 
    tree.setVisibleRowCount(8);

    // Создание закладок и таблиц с данными 
    tabbedPane = new JTabbedPane();
    for (int i = 0; i < 3; i++) {
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());

      JButton button = new JButton("Посмотреть краткую информацию ");
      panel.add(button, BorderLayout.NORTH);

      JTable table = new JTable(new Object[][] {
        {
          "Музей 1 ",
          "Музей 2"
        }, {
          "Музей 3",
          "Музей 4"
        }, {
          "Музей 5",
          "Музей 7"
        }, {
          "Музей 6",
          "Музей 8"
        },
      }, new Object[] {
        "Музеи, которые я посетил",
        "Музеи, которые хочу посетить"
      });
      JScrollPane scrollPane = new JScrollPane(table);
      panel.add(scrollPane, BorderLayout.CENTER);

      tabbedPane.addTab("Закладка " + (i + 1), panel);

    }

    // Создание главного меню и инструментов 
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("Файл");
    JMenu editMenu = new JMenu("Редактировать");
    JMenu copyMenu = new JMenu("Копировать");
    JMenu vrMenu = new JMenu("Вырезать");
    JRadioButton optionS = new JRadioButton("Black style");
    JRadioButton optionO = new JRadioButton("White style");
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(copyMenu);
    menuBar.add(vrMenu);
    setJMenuBar(menuBar);
    menuBar.add(optionO);
    menuBar.add(optionS);
    JButton fileMenuSave = new JButton("Сохранить");
    JButton fileMenuSaveAs = new JButton("Сохранить как");
    JButton fileMenuDelete = new JButton("Удалить");
    fileMenu.add(fileMenuSave);
    fileMenu.add(fileMenuSaveAs);
    fileMenu.add(fileMenuDelete);

    // Создание ползунков 
    JScrollBar horizontalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL);

    // Создание разделенного экрана 
    splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScrollPane, tabbedPane);

    // Установка ползунков 
    splitPane.setLeftComponent(treeScrollPane);
    splitPane.setRightComponent(tabbedPane);
    splitPane.setDividerSize(10); // Установка размера разделителя

    // Добавление компонентов на форму 
    getContentPane().add(splitPane, BorderLayout.CENTER);
    getContentPane().add(horizontalScrollBar, BorderLayout.SOUTH);
    getContentPane().add(verticalScrollBar, BorderLayout.EAST);
  }

  public static void main(String[] args) {

    SwingUtilities.invokeLater(FirstClass::new);
  }
}