package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.File;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jtq  reason: default package */
/* loaded from: classes.dex */
public final class jtq {
    private static final NumberFormat c = NumberFormat.getIntegerInstance(Locale.US);
    public static final Set a = new HashSet();
    public static final Object b = new Object();

    static {
        TimeUnit.DAYS.toMillis(1L);
        TimeUnit.HOURS.toMillis(1L);
        TimeUnit.MINUTES.toMillis(1L);
        TimeUnit.SECONDS.toMillis(1L);
    }

    private static String A(String str, String str2) {
        if (!str.isEmpty()) {
            str = str.concat("|");
        }
        return str.concat(str2);
    }

    public static jth a() {
        jth jthVar = new jth();
        jthVar.b = "--empty--";
        jthVar.c = (byte) (jthVar.c | 9);
        jthVar.f(Integer.MAX_VALUE);
        jthVar.c = (byte) (jthVar.c | 32);
        jthVar.e(true);
        jthVar.a = true;
        jthVar.c = (byte) (jthVar.c | 4);
        jthVar.d(false);
        jthVar.f(180);
        jthVar.e(true);
        jthVar.d(true);
        return jthVar;
    }

    public static String b(int i, int i2, int i3, int i4) {
        String str = "?";
        String str2 = i != 0 ? i != 1 ? i != 2 ? str : "m" : "W" : "*";
        String str3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? str : "b" : "C" : "*";
        String str4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? str : "u" : "I" : "*";
        if (i4 == 0) {
            str = "*";
        } else if (i4 == 1) {
            str = "N";
        } else if (i4 == 2) {
            str = "l";
        }
        return str2 + ":" + str3 + ":" + str4 + ":" + str;
    }

    public static String c(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = 2;
        int i2 = true != z ? 2 : 1;
        int i3 = true != z2 ? 2 : 1;
        int i4 = true != z3 ? 2 : 1;
        if (true == z4) {
            i = 1;
        }
        return b(i2, i3, i4, i);
    }

    public static String d(long j) {
        String format;
        if (j >= 1073741824) {
            NumberFormat numberFormat = c;
            double d = j;
            Double.isNaN(d);
            format = numberFormat.format(Math.min(Math.ceil(d / 1.073741824E9d), 999.0d));
        } else if (j < 1048576) {
            NumberFormat numberFormat2 = c;
            double d2 = j;
            Double.isNaN(d2);
            format = numberFormat2.format(Math.ceil(d2 / 1024.0d));
        } else {
            NumberFormat numberFormat3 = c;
            double d3 = j;
            Double.isNaN(d3);
            format = numberFormat3.format(Math.ceil(d3 / 1048576.0d));
        }
        return format + " " + (j >= 1073741824 ? "GB" : j >= 1048576 ? "MB" : "kB");
    }

    public static String e(long j) {
        return DateFormat.getDateTimeInstance(3, 3).format(new Date(j));
    }

    public static String f(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "No active network available";
        }
        String typeName = activeNetworkInfo.getTypeName();
        String valueOf = String.valueOf(activeNetworkInfo.getState());
        boolean isConnected = activeNetworkInfo.isConnected();
        boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        return "{" + typeName + ", state: " + valueOf + ", connected: " + isConnected + ", metered: " + isActiveNetworkMetered + "}";
    }

    public static String g(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            String name = parentFile.getName();
            String name2 = file.getName();
            return name + "/" + name2;
        }
        return file.getName();
    }

    public static String h(Collection collection, leq leqVar) {
        if (collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : collection) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append((String) leqVar.a(obj));
        }
        sb.append("]");
        return sb.toString();
    }

    public static String i(long j) {
        return j == Long.MAX_VALUE ? "<unlimited>" : d(j);
    }

    public static String j(String str, Long l) {
        return !q(str) ? Long.toString(l.longValue()) : "redacted";
    }

    public static String k(String str, String str2) {
        return !q(str) ? str2 : "redacted";
    }

    public static String l(int i) {
        return i != 0 ? i != 1 ? "pinned" : "reserved" : "not_res";
    }

    public static String m(int i) {
        if (i == 0) {
            return "*";
        }
        String str = "";
        if ((i & 1) != 0) {
            str = A(str, "fg");
            i &= -2;
        }
        if ((i & 2) != 0) {
            str = A(str, "bg");
            i &= -3;
        }
        return i != 0 ? A(str, "?") : str;
    }

    public static String n(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }

    public static void o(boolean z) {
        if (!z) {
            return;
        }
        throw new UnsupportedOperationException("Operation not supported on a closed object.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0014 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(java.util.Collection r6, java.util.Collection r7, defpackage.jtp r8, java.util.Comparator r9) {
        /*
            llp r6 = (defpackage.llp) r6
            lta r6 = r6.listIterator()
            llp r7 = (defpackage.llp) r7
            lta r7 = r7.listIterator()
            java.lang.Object r0 = defpackage.lre.W(r6)
            java.lang.Object r1 = defpackage.lre.W(r7)
        L14:
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r1 == 0) goto L26
            int r4 = r9.compare(r0, r1)
            if (r4 >= 0) goto L21
            goto L26
        L21:
            if (r4 <= 0) goto L24
            goto L2a
        L24:
            r4 = 0
            goto L2b
        L26:
            r4 = 2
            goto L2b
        L28:
            if (r1 == 0) goto L72
        L2a:
            r4 = 1
        L2b:
            if (r4 == r3) goto L4e
            if (r4 != r2) goto L35
            defpackage.jdg.u(r0)
            r8.a(r0, r2)
        L35:
            java.lang.Object r5 = defpackage.lre.W(r6)
            if (r5 == 0) goto L4d
            defpackage.jdg.u(r0)
            int r0 = r9.compare(r0, r5)
            if (r0 > 0) goto L45
            goto L4d
        L45:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The left list is not ordered."
            r6.<init>(r7)
            throw r6
        L4d:
            r0 = r5
        L4e:
            if (r4 == r2) goto L14
            if (r4 != r3) goto L58
            defpackage.jdg.u(r1)
            r8.a(r1, r3)
        L58:
            java.lang.Object r2 = defpackage.lre.W(r7)
            if (r2 == 0) goto L70
            defpackage.jdg.u(r1)
            int r1 = r9.compare(r1, r2)
            if (r1 > 0) goto L68
            goto L70
        L68:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The right list is not ordered."
            r6.<init>(r7)
            throw r6
        L70:
            r1 = r2
            goto L14
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtq.p(java.util.Collection, java.util.Collection, jtp, java.util.Comparator):void");
    }

    public static boolean q(String str) {
        boolean contains;
        synchronized (b) {
            contains = a.contains(str);
        }
        return contains;
    }

    public static void r(String str, long j) {
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s must be greater than zero.", str));
    }

    public static void s(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s must be greater than or equal to zero.", str));
    }

    public static boolean t(int i) {
        return (i & 1) != 0;
    }

    public static List u(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, leq leqVar) {
        Throwable th;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            sb.append("SELECT ");
            ker.f(", ", strArr, sb);
            sb.append(" FROM ");
            sb.append(str);
            String str2 = strArr[0];
            sb.append(" GROUP BY " + str2);
            klh e = ker.e(sb, arrayList2);
            cursor = sQLiteDatabase.rawQuery(e.a, e.a());
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    Object a2 = leqVar.a(cursor);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public static String v() {
        return "redacted";
    }

    public static void w(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException("Invalid reservation state value: " + i);
        }
    }

    public static void x(int i) {
        if ((i & (-4)) == 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid scheduling flags value: " + i);
    }

    public static String y() {
        return "chill";
    }

    public static void z(Collection collection) {
        h(collection, jky.j);
    }
}
