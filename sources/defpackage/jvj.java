package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvj  reason: default package */
/* loaded from: classes.dex */
public final class jvj implements jvc {
    private static final String[] c = {"parent_id", "pack_name", "packing_scheme"};
    public final jum a;
    public final jtb b = new juz(this, 2);

    public jvj(jum jumVar) {
        this.a = jumVar;
    }

    @Override // defpackage.jvc
    public final Collection a() {
        try {
            return jtq.u(this.a.getReadableDatabase(), "pending_packs", c, jky.l);
        } catch (SQLiteException e) {
            jum jumVar = this.a;
            IOException iOException = new IOException("SqlitePendingPacks#getParentIds, SQL query failed", e);
            jumVar.a(iOException);
            throw iOException;
        }
    }

    @Override // defpackage.jvc
    public final List b(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.a.getReadableDatabase().query("pending_packs", c, "parent_id=?", new String[]{str}, null, null, null, null);
                while (cursor != null) {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    arrayList.add(jvb.a(jsr.e(cursor.getString(1)), cursor.getString(2)));
                }
                return arrayList;
            } catch (SQLiteException e) {
                jum jumVar = this.a;
                IOException iOException = new IOException("SqlitePendingPacks#get, SQL query failed, parentId: " + str, e);
                jumVar.a(iOException);
                throw iOException;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
