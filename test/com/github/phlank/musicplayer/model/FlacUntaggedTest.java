package com.github.phlank.musicplayer.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.phlank.musicplayer.model.Song;
import com.github.phlank.musicplayer.model.SongFormat;

public class FlacUntaggedTest {

	private static final String TEST_SONG_FILE_PATH = "test-assets/sine440untagged.flac";

	private Song testSong;

	@Before
	public void loadSong() throws Exception {
		testSong = new Song(TEST_SONG_FILE_PATH);
	}

	@Test
	public void testSongTitleForMp3Untagged() {
		Assert.assertEquals("Unknown Song", testSong.getTitle());
	}

	@Test
	public void testArtistTitleForMp3Untagged() {
		Assert.assertEquals("Unknown Artist", testSong.getArtistTitle());
	}

	@Test
	public void testAlbumTitleForMp3Untagged() {
		Assert.assertEquals("Unknown Album", testSong.getAlbumTitle());
	}

	@Test
	public void testAlbumArtistTitleForMp3Untagged() {
		Assert.assertEquals("Unknown Artist", testSong.getAlbumArtistTitle());
	}

	@Test
	public void testSongNumberForMp3Untagged() {
		Assert.assertEquals("", testSong.getNumber());
	}

	@Test
	public void testSongDiskNumberForMp3Untagged() {
		Assert.assertEquals("", testSong.getDiskNumber());
	}

	@Test
	public void testSongYear() {
		Assert.assertEquals("Unknown Year", testSong.getYear());
	}

	@Test
	public void testSongTimeInSeconds() {
		Assert.assertEquals(0, testSong.getLength());
	}

	@Test
	public void testSongFormat() {
		Assert.assertEquals(SongFormat.FLAC, testSong.getFormat());
	}

}
