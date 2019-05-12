package pl.edu.wszib.projekt.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.wszib.projekt.domains.SelectedColor;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest // kopiujemy z głównego testu
public class SelectedColorDaoTest {

    public static final String COLOR1 = "red";
    public static final String COLOR2 = "blue";

    @Autowired
    SelectedColorDao selectedColorDao; //to piszemy

    @Before
    public void setUp() throws Exception {

        SelectedColor selectedColor1 = new SelectedColor (COLOR1, new Date()); // tworzymy 2 kolory
        SelectedColor selectedColor2 = new SelectedColor (COLOR2, new Date());

        assertNull(selectedColor1.getId()); // sprawdzamy czy nie ma ID na początku nie powinno go być
        assertNull(selectedColor2.getId());

        selectedColorDao.save(selectedColor1); // zapisujemy do bazy
        selectedColorDao.save(selectedColor2);
        System.out.println("---------------------------------");
        assertNotNull(selectedColor1.getId()); // sprawdzamy czy są ID teraz powinny już być być
        assertNotNull(selectedColor2.getId());

    }
    @Test
    public void testFetchAllData() { // wyciągamy wszystkie zapisane dane to jest nasz test


        Iterable<SelectedColor> selectedColors = selectedColorDao.findAll(); // pobieramy wszystkie utworzone elementy
        int counter = 0;
        for (SelectedColor selectedColor : selectedColors) {
            counter++;
        }

        assertTrue(counter >=2);


    }

    @Test
    public void testFindByColor() {
        List<SelectedColor> selectedColors = selectedColorDao.findByColor(COLOR1);
        System.out.println("--------------" + selectedColors. size());
        assertEquals(COLOR1,selectedColors.get(0).getColor());
        //selectedColorDao.findByColor("red");
        //selectedColorDao.findByColor("blue");

        //assertNotNull(selectedColorDao.findByColor("red"));
        //assertNotNull(selectedColorDao.findByColor("blue"));



    }


}