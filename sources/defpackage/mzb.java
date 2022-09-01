package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: mzb  reason: default package */
/* loaded from: classes2.dex */
public final class mzb implements Closeable {
    public final SQLiteOpenHelper a;
    public final myt b;
    public final lmz c;

    public mzb(Context context, myq myqVar) {
        jdg.y(myqVar.a.size() != 1 ? false : true, "schema must contain a single table, found %s", myqVar.a.size());
        myt mytVar = (myt) myqVar.a.get(0);
        this.b = mytVar;
        HashSet m = lvw.m(mytVar.b.size());
        for (myp mypVar : mytVar.b) {
            m.add(mypVar.a);
        }
        this.c = lmz.p(m);
        this.a = new mza(this, context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
