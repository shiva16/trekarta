package mobi.maptrek.data.source;

import android.database.Cursor;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import mobi.maptrek.data.Track;
import mobi.maptrek.data.Waypoint;
import mobi.maptrek.io.TrackManager;

public class FileDataSource extends DataSource implements WaypointDataSource, TrackDataSource {
    public String path;
    @NonNull
    public List<Waypoint> waypoints = new ArrayList<>();
    @NonNull
    public List<Track> tracks = new ArrayList<>();
    // Native format helper data
    public long propertiesOffset;

    @Override
    public boolean isNativeTrack() {
        return (path != null && path.endsWith(TrackManager.EXTENSION)) || (path == null && waypoints.isEmpty() && tracks.size() == 1);
    }

    @Override
    public void saveWaypoint(Waypoint waypoint) {

    }

    @Override
    public void deleteWaypoint(Waypoint waypoint) {

    }

    @NonNull
    @Override
    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    @Override
    public int getWaypointsCount() {
        return waypoints.size();
    }

    @Override
    public Cursor getCursor() {
        return null;
    }

    @Override
    public Waypoint cursorToWaypoint(Cursor cursor) {
        return null;
    }

    @Override
    public void addListener(WaypointDataSourceUpdateListener listener) {

    }

    @Override
    public void removeListener(WaypointDataSourceUpdateListener listener) {

    }

    @Override
    public void saveTrack(Track track) {

    }

    @Override
    public void deleteTrack(Track track) {

    }

    @NonNull
    @Override
    public List<Track> getTracks() {
        return tracks;
    }
}