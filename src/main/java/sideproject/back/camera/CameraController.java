package sideproject.back.camera;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CameraController {

    private final CameraService cameraService;

}
