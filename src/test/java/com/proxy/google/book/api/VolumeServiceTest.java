package com.proxy.google.book.api;

import com.proxy.google.book.api.domain.Volume;
import com.proxy.google.book.api.service.VolumeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VolumeServiceTest {

    @Autowired
    private VolumeService volumeService;

    @Test
    public void searchByTitleAndAuthor() {

        List<Volume> volumes = volumeService.searchByTitleAndAuthor("Wild flowers and their teachings", "Wild flowers");
        Assert.assertNotNull(volumes);
        Assert.assertTrue(!volumes.isEmpty());
    }


}
