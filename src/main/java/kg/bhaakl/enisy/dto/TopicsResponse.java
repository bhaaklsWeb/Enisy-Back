package kg.bhaakl.enisy.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
public class TopicsResponse {
    @NonNull
    private List<TopicDTO> topics;
}
