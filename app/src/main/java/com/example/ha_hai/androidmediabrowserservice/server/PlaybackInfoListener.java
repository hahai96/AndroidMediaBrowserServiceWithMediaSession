package com.example.ha_hai.androidmediabrowserservice.server;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.MediaSessionCompat;

/**
 * Listener to provide state updates from MediaPlayerAdapter (the media player)
 * to {@link MusicService} (the service that holds our {@link MediaSessionCompat}.
 */
public abstract class PlaybackInfoListener {

    public abstract void onPlaybackStateChange(PlaybackStateCompat state);

    public void onPlaybackCompleted() {
    }
}