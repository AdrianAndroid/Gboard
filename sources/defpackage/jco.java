package defpackage;

import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.util.Printer;
import android.view.Window;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jco  reason: default package */
/* loaded from: classes.dex */
public final class jco {
    public static iyg a;
    public static boc b;

    public jco() {
    }

    public jco(byte[] bArr, byte[] bArr2) {
    }

    public jco(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        new HashMap();
    }

    public static int A(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
            default:
                return 0;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
        }
    }

    public static int B(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int C(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int D(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int E(int i) {
        if (i != 0) {
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int F(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static void a(final Dialog dialog, final jav javVar) {
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: jcu
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Dialog dialog2 = dialog;
                jav javVar2 = javVar;
                Window window = dialog2.getWindow();
                if (window == null || !dialog2.isShowing()) {
                    return;
                }
                jdy.f(new jcv(javVar2.a(), 0), window.getDecorView());
            }
        });
    }

    public static void b(Dialog dialog, IBinder iBinder) {
        Window window;
        if (iBinder != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.token = iBinder;
            attributes.type = 1003;
            window.setAttributes(attributes);
        }
        dialog.show();
    }

    public static final jej c(fjv fjvVar) {
        return Build.VERSION.SDK_INT < 26 ? new jei(1) : new jei(fjvVar, 0);
    }

    public static void d(iss issVar, Context context) {
        issVar.b(context.getApplicationContext(), context.getTheme());
    }

    public static void f(ijh ijhVar, Printer printer) {
        printer.println(ijhVar.toString());
    }

    public static mko g(mko mkoVar, Class cls, leq leqVar, Executor executor) {
        return mhu.g(mkoVar, cls, ldd.a(leqVar), executor);
    }

    public static mko h(mko mkoVar, Class cls, miy miyVar, Executor executor) {
        return mhu.h(mkoVar, cls, ldd.c(miyVar), executor);
    }

    public static mko i(mko mkoVar, leq leqVar, Executor executor) {
        return mio.g(mkoVar, ldd.a(leqVar), executor);
    }

    public static mko j(mko mkoVar, miy miyVar, Executor executor) {
        return mio.h(mkoVar, ldd.c(miyVar), executor);
    }

    public static void k(mko mkoVar, mka mkaVar, Executor executor) {
        kcu.U(mkoVar, ldd.e(mkaVar), executor);
    }

    public static lcq l(String str, ldi ldiVar) {
        return ldh.c(str, ldiVar, lcr.a, false);
    }

    public static /* synthetic */ boolean m(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static void n(jma jmaVar, String str, ContentValues contentValues) {
        if (jmaVar.e(str, contentValues) != -1) {
            return;
        }
        throw new SQLiteException("Failed to insert into ".concat(str));
    }

    public static int o(jma jmaVar, jma jmaVar2) {
        jmaVar.f(jmaVar2);
        int i = 0;
        String[] strArr = new String[0];
        jma.c();
        lcq b2 = ldh.b("Query: SELECT Changes()", ldi.a);
        try {
            Cursor rawQuery = ((SQLiteDatabase) jmaVar.a).rawQuery("SELECT Changes()", strArr, (CancellationSignal) jmaVar.b);
            b2.close();
            try {
                if (rawQuery.moveToNext()) {
                    i = rawQuery.getInt(0);
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return i;
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                b2.close();
            } catch (Throwable th4) {
                kxc.l(th3, th4);
            }
            throw th3;
        }
    }

    public static irh p(jma jmaVar, jma jmaVar2) {
        jma.c();
        lcq b2 = ldh.b("Query: ".concat((String) jmaVar2.b), ldi.a);
        try {
            Object obj = jmaVar.a;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(new krq((Object[]) jmaVar2.a), (String) jmaVar2.b, null, null, (CancellationSignal) jmaVar.b);
            b2.close();
            return irh.a(rawQueryWithFactory);
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                kxc.l(th, th2);
            }
            throw th;
        }
    }

    public static int q(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static int r(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int s(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int t(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int u(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int v(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int w(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int x(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int y(int i) {
        int i2 = 87010621;
        if (i != 87010621) {
            i2 = 159107666;
            if (i != 159107666) {
                return 0;
            }
        }
        return i2;
    }

    public static int z(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public jco(Set set) {
        if (set.isEmpty()) {
            lcs lcsVar = lcr.a;
        } else if (set.size() == 1) {
            lcs lcsVar2 = (lcs) set.iterator().next();
        } else {
            Iterator it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                lcs lcsVar3 = (lcs) it.next();
                i += lcsVar3.c.d;
                lcs lcsVar4 = lcsVar3.b;
            }
            if (i == 0) {
                lcs lcsVar5 = lcr.a;
                return;
            }
            qv qvVar = new qv(i);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                lcs lcsVar6 = (lcs) it2.next();
                int i2 = 0;
                while (true) {
                    qv qvVar2 = lcsVar6.c;
                    if (i2 < qvVar2.d) {
                        jdg.A(qvVar.put((jco) qvVar2.c(i2), lcsVar6.c.f(i2)) == null, "Duplicate bindings: %s", lcsVar6.c.c(i2));
                        i2++;
                    }
                }
                lcs lcsVar7 = lcsVar6.b;
            }
            new lcr(qvVar).a();
        }
    }
}
