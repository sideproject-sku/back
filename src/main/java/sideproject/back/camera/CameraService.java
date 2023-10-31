package sideproject.back.camera;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CameraService {

    private final CameraRepository cameraRepository;

    public void create(Date date, String image, int count){
        Camera camera = new Camera();
        camera.setDate(date);
        camera.setImage(image);
        camera.setCount(count);

        this.cameraRepository.save(camera);
    }

    public void delete(Camera camera){
        this.cameraRepository.delete(camera);
    }

}
