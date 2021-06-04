package com.test.article.persistence;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ArticleDao_Impl implements ArticleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ArticleDB> __insertionAdapterOfArticleDB;

  private final EntityDeletionOrUpdateAdapter<ArticleDB> __deletionAdapterOfArticleDB;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllArticleData;

  public ArticleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfArticleDB = new EntityInsertionAdapter<ArticleDB>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Article` (`articleId`,`title`,`description`,`avatar`,`date`,`rank`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleDB value) {
        stmt.bindLong(1, value.getArticleId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getAvatarUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAvatarUrl());
        }
        stmt.bindLong(5, value.getDate());
        stmt.bindLong(6, value.getRank());
      }
    };
    this.__deletionAdapterOfArticleDB = new EntityDeletionOrUpdateAdapter<ArticleDB>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Article` WHERE `articleId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ArticleDB value) {
        stmt.bindLong(1, value.getArticleId());
      }
    };
    this.__preparedStmtOfDeleteAllArticleData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Article";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ArticleDB articleDB, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfArticleDB.insert(articleDB);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertList(final List<ArticleDB> articles, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfArticleDB.insert(articles);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final ArticleDB articleDB, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfArticleDB.handle(articleDB);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllArticleData(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllArticleData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllArticleData.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object findAllArticles(final Continuation<? super List<ArticleDB>> p0) {
    final String _sql = "SELECT * FROM Article";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<ArticleDB>>() {
      @Override
      public List<ArticleDB> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "articleId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfRank = CursorUtil.getColumnIndexOrThrow(_cursor, "rank");
          final List<ArticleDB> _result = new ArrayList<ArticleDB>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ArticleDB _item;
            final int _tmpArticleId;
            _tmpArticleId = _cursor.getInt(_cursorIndexOfArticleId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAvatarUrl;
            _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final int _tmpRank;
            _tmpRank = _cursor.getInt(_cursorIndexOfRank);
            _item = new ArticleDB(_tmpArticleId,_tmpTitle,_tmpDescription,_tmpAvatarUrl,_tmpDate,_tmpRank);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getArticlesCount(final Continuation<? super Integer> p0) {
    final String _sql = "SELECT count(*) FROM Article";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object findArticleById(final int articleId, final Continuation<? super ArticleDB> p1) {
    final String _sql = "SELECT * FROM Article WHERE articleId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, articleId);
    return CoroutinesRoom.execute(__db, false, new Callable<ArticleDB>() {
      @Override
      public ArticleDB call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArticleId = CursorUtil.getColumnIndexOrThrow(_cursor, "articleId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAvatarUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfRank = CursorUtil.getColumnIndexOrThrow(_cursor, "rank");
          final ArticleDB _result;
          if(_cursor.moveToFirst()) {
            final int _tmpArticleId;
            _tmpArticleId = _cursor.getInt(_cursorIndexOfArticleId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAvatarUrl;
            _tmpAvatarUrl = _cursor.getString(_cursorIndexOfAvatarUrl);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final int _tmpRank;
            _tmpRank = _cursor.getInt(_cursorIndexOfRank);
            _result = new ArticleDB(_tmpArticleId,_tmpTitle,_tmpDescription,_tmpAvatarUrl,_tmpDate,_tmpRank);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
