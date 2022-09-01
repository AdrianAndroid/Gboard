package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: juu  reason: default package */
/* loaded from: classes.dex */
public final class juu {
    static final String[] a = {"download_id", "priority", "urls", "start_timestamp_millis", "requires_unmetered_network", "requires_charging", "file_path", "completed", "failure", "next_retry_time_millis", "retry_count", "superpack_name", "superpack_version", "ttl_millis", "scheduling_flags", "requires_idle", "requires_battery_not_low"};
    public final juw b;
    public final boolean c;
    public String d;
    public long e;
    public long f;

    public juu(juw juwVar, boolean z, String str, long j, long j2) {
        this.b = juwVar;
        this.c = z;
        this.d = str;
        this.e = j;
        this.f = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static juu h(Cursor cursor) {
        int i;
        List k;
        long j = cursor.getLong(3);
        try {
            i = cursor.getInt(14);
            jtq.x(i);
        } catch (IllegalArgumentException e) {
            ((luc) ((luc) jsh.a.d()).i(e)).t("Invalid scheduling flags value found in the table, ignoring value...");
            i = 0;
        }
        juv n = juw.n();
        n.c(cursor.getString(0));
        n.d(cursor.getInt(1));
        String string = cursor.getString(2);
        if (string == null) {
            k = Collections.emptyList();
        } else {
            k = lfy.c('|').h().b().k(string);
        }
        n.l(llp.o(k));
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        n.j(j);
        n.h(cursor.getInt(4) != 0);
        n.f(cursor.getInt(5) != 0);
        n.g(cursor.getInt(15) != 0);
        n.e(cursor.getInt(16) != 0);
        n.b(cursor.getString(6));
        n.k(cursor.getLong(13));
        n.i(i);
        String string2 = cursor.getString(11);
        if (string2 != null) {
            n.a = jtr.c(string2, cursor.getInt(12));
        }
        juw a2 = n.a();
        boolean z = cursor.getInt(7) != 0;
        String string3 = cursor.getString(8);
        long j2 = cursor.getLong(9);
        long j3 = cursor.getLong(10);
        jtq.s("nextRetryTimeMillis", j2);
        jtq.s("retryCount", j3);
        return new juu(a2, z, string3, j2, j3);
    }

    public final int a() {
        return ((juj) this.b).c;
    }

    public final int b() {
        return ((juj) this.b).j;
    }

    public final long c() {
        return ((juj) this.b).e;
    }

    public final long d() {
        return ((juj) this.b).l;
    }

    public final ContentValues e() {
        ContentValues contentValues = new ContentValues(12);
        contentValues.put("download_id", ((juj) this.b).a);
        jtr jtrVar = ((juj) this.b).b;
        if (jtrVar != null) {
            contentValues.put("superpack_name", jtrVar.b());
            contentValues.put("superpack_version", Integer.valueOf(jtrVar.a()));
        } else {
            contentValues.putNull("superpack_name");
            contentValues.put("superpack_version", (Integer) 0);
        }
        contentValues.put("priority", Integer.valueOf(((juj) this.b).c));
        contentValues.put("urls", lex.c('|').e().f(((juj) this.b).d));
        contentValues.put("start_timestamp_millis", Long.valueOf(((juj) this.b).e));
        contentValues.put("requires_unmetered_network", Integer.valueOf(((juj) this.b).f ? 1 : 0));
        contentValues.put("requires_charging", Integer.valueOf(((juj) this.b).g ? 1 : 0));
        contentValues.put("requires_idle", Integer.valueOf(((juj) this.b).h ? 1 : 0));
        contentValues.put("requires_battery_not_low", Integer.valueOf(((juj) this.b).i ? 1 : 0));
        contentValues.put("file_path", ((juj) this.b).k);
        contentValues.put("completed", Integer.valueOf(this.c ? 1 : 0));
        String str = this.d;
        if (str != null) {
            contentValues.put("failure", str);
        } else {
            contentValues.putNull("failure");
        }
        contentValues.put("next_retry_time_millis", Long.valueOf(this.e));
        contentValues.put("retry_count", Long.valueOf(this.f));
        contentValues.put("ttl_millis", Long.valueOf(((juj) this.b).l));
        contentValues.put("scheduling_flags", Integer.valueOf(((juj) this.b).j));
        return contentValues;
    }

    public final jsr f() {
        juw juwVar = this.b;
        juj jujVar = (juj) juwVar;
        if (jujVar.m == null) {
            synchronized (juwVar) {
                if (((juj) juwVar).m == null) {
                    ((juj) juwVar).m = jsr.e(((juj) juwVar).a);
                    if (((juj) juwVar).m == null) {
                        throw new NullPointerException("qualifiedName() cannot return null");
                    }
                }
            }
        }
        return jujVar.m;
    }

    public final jtr g() {
        return ((juj) this.b).b;
    }

    public final llp i() {
        return ((juj) this.b).d;
    }

    public final File j() {
        return new File(k());
    }

    public final String k() {
        return ((juj) this.b).k;
    }

    public final String l() {
        return ((juj) this.b).a;
    }

    public final void m(long j) {
        jdg.v(j > 0);
        this.e = j;
    }

    public final boolean n() {
        return ((juj) this.b).i;
    }

    public final boolean o() {
        return ((juj) this.b).g;
    }

    public final boolean p() {
        return ((juj) this.b).h;
    }

    public final boolean q() {
        return ((juj) this.b).f;
    }

    public final String toString() {
        juw juwVar = this.b;
        String str = ((juj) juwVar).a;
        String m = juwVar.m();
        String m2 = jtq.m(((juj) this.b).j);
        int a2 = a();
        return "{" + str + ", " + m + ", " + m2 + ", p" + a2 + "}";
    }
}
