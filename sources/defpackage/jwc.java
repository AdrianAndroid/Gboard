package defpackage;

import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteMisuseException;
import java.util.zip.ZipException;

/* compiled from: PG */
/* renamed from: jwc  reason: default package */
/* loaded from: classes.dex */
public final class jwc {
    public static final /* synthetic */ int a = 0;
    private static final mfm b = c(2);
    private static final llw c;

    static {
        lls llsVar = new lls();
        llsVar.a(jtz.class, c(27));
        llsVar.a(SQLiteAccessPermException.class, c(13));
        llsVar.a(SQLiteDatabaseCorruptException.class, c(15));
        llsVar.a(SQLiteDatabaseLockedException.class, c(16));
        llsVar.a(SQLiteCantOpenDatabaseException.class, c(14));
        llsVar.a(SQLiteMisuseException.class, c(17));
        llsVar.a(ZipException.class, c(21));
        llsVar.a(jpz.class, c(22));
        llsVar.a(jsl.class, c(23));
        llsVar.a(jsm.class, c(24));
        llsVar.a(jsk.class, c(25));
        llsVar.a(jxb.class, c(26));
        c = llsVar.l();
    }

    public static mfm a(Throwable th) {
        int i;
        Class<?> cls = th.getClass();
        if (cls == jxe.class) {
            kam kamVar = ((jxe) th).a;
            nfh t = mfm.c.t();
            int i2 = kamVar.d;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            switch (i3) {
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                default:
                    i = 2;
                    break;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((mfm) t.b).a = lxj.r(i);
            int i4 = kamVar.a;
            if (i4 > 0) {
                ((mfm) t.b).b = i4;
            }
            return (mfm) t.cz();
        } else if (cls == jyz.class) {
            return c(19);
        } else {
            mfm mfmVar = (mfm) c.get(cls);
            return mfmVar != null ? mfmVar : b;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        r10 = r2.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r3.a(r10) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r1.a(r10);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r6.add(r5);
        r5 = r5.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r9 >= r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r6.size() < 5) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List b(java.lang.Throwable r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            j$.util.Objects.requireNonNull(r0)
            jpg r1 = new jpg
            r2 = 9
            r1.<init>(r0, r2)
            if (r12 != 0) goto L12
            goto L71
        L12:
            mfm r2 = a(r12)
            int r3 = r2.a
            int r3 = defpackage.lxj.s(r3)
            r4 = 2
            if (r3 != 0) goto L20
            goto L24
        L20:
            if (r3 != r4) goto L24
            r4 = 3
            goto L27
        L24:
            r1.a(r2)
        L27:
            jky r2 = defpackage.jky.o
            dyv r3 = defpackage.dyv.t
            java.lang.Throwable r5 = r12.getCause()
            if (r5 == 0) goto L71
            boolean r6 = r5.equals(r12)
            if (r6 != 0) goto L71
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 5
            r6.<init>(r7)
            r8 = 0
            r9 = 0
        L3f:
            if (r5 == r12) goto L71
            r10 = 0
        L42:
            int r11 = r6.size()
            if (r10 >= r11) goto L51
            java.lang.Object r11 = r6.get(r10)
            if (r5 == r11) goto L71
            int r10 = r10 + 1
            goto L42
        L51:
            java.lang.Object r10 = r2.a(r5)
            boolean r11 = r3.a(r10)
            if (r11 == 0) goto L60
            r1.a(r10)
            int r9 = r9 + 1
        L60:
            r6.add(r5)
            java.lang.Throwable r5 = r5.getCause()
            if (r5 == 0) goto L71
            if (r9 >= r4) goto L71
            int r10 = r6.size()
            if (r10 < r7) goto L3f
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwc.b(java.lang.Throwable):java.util.List");
    }

    public static mfm c(int i) {
        nfh t = mfm.c.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((mfm) t.b).a = lxj.r(i);
        return (mfm) t.cz();
    }
}
