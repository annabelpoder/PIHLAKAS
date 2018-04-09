package com.example.pihlakasspring.player;

import com.example.pihlakasspring.track.Track;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class PlayTrack {
    @Id
    Long id;
    Track track;
}
