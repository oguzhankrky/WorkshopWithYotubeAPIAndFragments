package com.example.myapplication.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavouriteVideoDao_Impl implements FavouriteVideoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavouriteVideo> __insertionAdapterOfFavouriteVideo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteVideoFromFav;

  public FavouriteVideoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavouriteVideo = new EntityInsertionAdapter<FavouriteVideo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `FavouriteVideo` (`id`,`VideoAddress`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteVideo value) {
        stmt.bindLong(1, value.getId());
        if (value.getVideoAddress() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getVideoAddress());
        }
      }
    };
    this.__preparedStmtOfDeleteVideoFromFav = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM FavouriteVideo WHERE VideoAddress = ?";
        return _query;
      }
    };
  }

  @Override
  public void addFavouriteVideo(final FavouriteVideo favouritevideo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFavouriteVideo.insert(favouritevideo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteVideoFromFav(final String VideoAddress) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteVideoFromFav.acquire();
    int _argIndex = 1;
    if (VideoAddress == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, VideoAddress);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteVideoFromFav.release(_stmt);
    }
  }

  @Override
  public LiveData<List<FavouriteVideo>> readAllData() {
    final String _sql = "SELECT * FROM FavouriteVideo ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"FavouriteVideo"}, false, new Callable<List<FavouriteVideo>>() {
      @Override
      public List<FavouriteVideo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfVideoAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "VideoAddress");
          final List<FavouriteVideo> _result = new ArrayList<FavouriteVideo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavouriteVideo _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpVideoAddress;
            _tmpVideoAddress = _cursor.getString(_cursorIndexOfVideoAddress);
            _item = new FavouriteVideo(_tmpId,_tmpVideoAddress);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public boolean isRowIsExist(final String VideoAddress) {
    final String _sql = "SELECT EXISTS(SELECT * FROM FavouriteVideo WHERE VideoAddress = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (VideoAddress == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, VideoAddress);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
