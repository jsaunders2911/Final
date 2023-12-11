package guilford.edu;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;

public class WeightDriver {
    public static void main(String[] args) {
        Weight beginnerLifter = new Weight("Beginner", 135, 250, 225);
        Weight intermediateLifter = new Weight("Intermediate", 225, 315, 275);
        Weight advancedLifter = new Weight("Advanced", 315, 405, 315);
        Weight eliteLifter = new Weight("Elite", 405, 495, 495);

        ArrayList<Weight> theObjects = new ArrayList<Weight>();
        theObjects.add(beginnerLifter);
        theObjects.add(intermediateLifter);
        theObjects.add(advancedLifter);
        theObjects.add(eliteLifter);

        JFrame myFrame = new JFrame("CollisionChoice Interaction");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel multiViewPanel = new JPanel();
        multiViewPanel.setPreferredSize(new Dimension(1100, 450));
        multiViewPanel.setBackground(new Color(221, 212, 232));

        // Instantiate the CollisionChoicePanel object and add it to the multiViewPanel
        WeightClassPanel fitnessPanel = new WeightClassPanel(theObjects);
        fitnessPanel.setPreferredSize(new Dimension(300, 400));
        fitnessPanel.setBackground(new Color(193, 179, 215));
        multiViewPanel.add(fitnessPanel);

        JPanel motivationalPanel = new MotivationClassPanel(theObjects);
        motivationalPanel.setPreferredSize(new Dimension(400, 400));
        motivationalPanel.setBackground(new Color(165, 137, 193));
        multiViewPanel.add(motivationalPanel);

        JPanel nutritionPanel = new NutritionClassPanel(theObjects);
        nutritionPanel.setPreferredSize(new Dimension(300, 400));
        nutritionPanel.setBackground(new Color(193, 179, 215));
        multiViewPanel.add(nutritionPanel);

        myFrame.getContentPane().add(multiViewPanel);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}