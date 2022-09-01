package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.database.CursorWrapper;

/* compiled from: PG */
/* renamed from: irh  reason: default package */
/* loaded from: classes.dex */
public final class irh extends CursorWrapper {
    private final ContentProviderClient a;
    private int b;

    public irh(Cursor cursor, ContentProviderClient contentProviderClient) {
        super(cursor);
        this.a = contentProviderClient;
        this.b = d(cursor, contentProviderClient);
    }

    public static irh a(Cursor cursor) {
        return new irh(cursor, null);
    }

    private static int d(Cursor cursor, ContentProviderClient contentProviderClient) {
        try {
            if (cursor.isClosed()) {
                throw new IllegalStateException("The cursor is closed");
            }
            return cursor.getCount();
        } catch (Error e) {
            jls.l(contentProviderClient);
            throw e;
        } catch (RuntimeException e2) {
            jls.l(contentProviderClient);
            throw new irb("Failed to get initial cursor count", e2);
        }
    }

    public final llp b(leq leqVar) {
        llk f = llp.f(getCount());
        moveToPosition(-1);
        while (moveToNext()) {
            f.h(leqVar.a(this));
        }
        return f.g();
    }

    public final String c(int i) {
        return lfd.d(super.getString(i));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            jls.l(this.a);
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        int count = super.getCount();
        this.b = count;
        return count;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        int position = getPosition() + i;
        if (super.move(i)) {
            return true;
        }
        if (position >= 0 && position < this.b) {
            throw new irc();
        }
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        if (super.moveToFirst()) {
            return true;
        }
        if (this.b != 0) {
            throw new irc();
        }
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        if (super.moveToLast()) {
            return true;
        }
        if (this.b != 0) {
            throw new irc();
        }
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        if (super.moveToNext()) {
            return true;
        }
        if (!isAfterLast()) {
            throw new irc();
        }
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        if (super.moveToPosition(i)) {
            return true;
        }
        if (i >= 0 && i < this.b) {
            throw new irc();
        }
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        if (super.moveToPrevious()) {
            return true;
        }
        if (!isBeforeFirst()) {
            throw new irc();
        }
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean requery() {
        boolean requery = super.requery();
        if (requery) {
            getCount();
        }
        return requery;
    }
}
