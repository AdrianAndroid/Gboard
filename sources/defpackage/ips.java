package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: ips  reason: default package */
/* loaded from: classes.dex */
public final class ips implements ipu {
    private final Cursor a;

    public ips(Cursor cursor) {
        this.a = cursor;
        if (cursor.moveToFirst()) {
            for (int i = 0; i < cursor.getColumnCount(); i++) {
                if (cursor.getType(i) == 0) {
                    throw new IllegalArgumentException(String.format("Value of column '%s' is null. Consider IFNULL function.", cursor.getColumnName(i)));
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final oxo next() {
        if (hasNext()) {
            Cursor cursor = this.a;
            nfh t = oxr.b.t();
            for (int i = 0; i < cursor.getColumnCount(); i++) {
                String columnName = cursor.getColumnName(i);
                if (cursor.getType(i) == 2) {
                    float f = cursor.getFloat(i);
                    nfh t2 = oxp.c.t();
                    nfh t3 = oxs.b.t();
                    t3.eR(f);
                    oxs oxsVar = (oxs) t3.cz();
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    oxp oxpVar = (oxp) t2.b;
                    oxsVar.getClass();
                    oxpVar.b = oxsVar;
                    oxpVar.a = 2;
                    t.eQ(columnName, (oxp) t2.cz());
                } else if (cursor.getType(i) == 1) {
                    long j = cursor.getLong(i);
                    nfh t4 = oxp.c.t();
                    nfh t5 = oxt.b.t();
                    t5.eS(j);
                    oxt oxtVar = (oxt) t5.cz();
                    if (t4.c) {
                        t4.cD();
                        t4.c = false;
                    }
                    oxp oxpVar2 = (oxp) t4.b;
                    oxtVar.getClass();
                    oxpVar2.b = oxtVar;
                    oxpVar2.a = 3;
                    t.eQ(columnName, (oxp) t4.cz());
                } else if (cursor.getType(i) == 3) {
                    String d = lfd.d(cursor.getString(i));
                    nfh t6 = oxp.c.t();
                    nfh t7 = oxn.b.t();
                    t7.eP(nem.w(d));
                    oxn oxnVar = (oxn) t7.cz();
                    if (t6.c) {
                        t6.cD();
                        t6.c = false;
                    }
                    oxp oxpVar3 = (oxp) t6.b;
                    oxnVar.getClass();
                    oxpVar3.b = oxnVar;
                    oxpVar3.a = 1;
                    t.eQ(columnName, (oxp) t6.cz());
                } else if (cursor.getType(i) != 4) {
                    throw new IllegalArgumentException(String.format("%s not supported.", Integer.valueOf(cursor.getType(i))));
                } else {
                    byte[] blob = cursor.getBlob(i);
                    nfh t8 = oxp.c.t();
                    nfh t9 = oxn.b.t();
                    t9.eP(nem.u(blob));
                    oxn oxnVar2 = (oxn) t9.cz();
                    if (t8.c) {
                        t8.cD();
                        t8.c = false;
                    }
                    oxp oxpVar4 = (oxp) t8.b;
                    oxnVar2.getClass();
                    oxpVar4.b = oxnVar2;
                    oxpVar4.a = 1;
                    t.eQ(columnName, (oxp) t8.cz());
                }
            }
            nfh t10 = oxo.b.t();
            if (t10.c) {
                t10.cD();
                t10.c = false;
            }
            oxr oxrVar = (oxr) t.cz();
            oxrVar.getClass();
            ((oxo) t10.b).a = oxrVar;
            oxo oxoVar = (oxo) t10.cz();
            this.a.moveToNext();
            return oxoVar;
        }
        throw new IllegalStateException("It does not have available example data.");
    }

    @Override // defpackage.ipu, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a.isAfterLast() && !this.a.isClosed();
    }
}
