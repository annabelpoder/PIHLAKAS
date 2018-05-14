package com.example.pihlakasspring.track;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class TrackAdd {
    @Autowired
    private JdbcTemplate database;

    public List<Track> findAvailableTracks(){
        return database.query("SELECT * FROM TRACK WHERE AVAILABLE = TRUE;", new TrackMapper());
    }

    public List<Track> findAllTracks(){return database.query("SELECT * FROM TRACK;", new TrackMapper());}

    public void insert(NewTrackJson json){
        List<Object> args = new ArrayList<>();
        args.add(json.getName());
        args.add(true);

        database.update("INSERT INTO TRACK(name,available) VALUES (?,?);", args.toArray());
    }

    public Track findById(Long trackId){
        List<Object> args = new ArrayList<>();
        args.add(trackId);
        return database.query("SELECT * FROM TRACK WHERE id = ?;", args.toArray(), new TrackMapper()).get(0);
    }

    public void updateAvailability(Long trackId, boolean availability){
        //TODO: update
    }

    private final class TrackMapper implements RowMapper<Track>{
        @Override
        public Track mapRow (ResultSet rs, int rowNum) throws SQLException{
            Track track = new Track();
            track.setId(rs.getLong("id"));
            track.setTrackName(rs.getString("name"));
            track.setAvailable(rs.getBoolean("available"));
            return track;
        }
    }
}
