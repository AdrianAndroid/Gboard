package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: guw  reason: default package */
/* loaded from: classes.dex */
public final class guw {
    public static volatile Context a;
    private static volatile Method b;

    @Deprecated
    public static Context a() {
        if (a != null) {
            return a;
        }
        if (b == null) {
            try {
                b = Class.forName("androidx.test.core.app.ApplicationProvider").getMethod("getApplicationContext", new Class[0]);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            return (Context) b.invoke(null, new Object[0]);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void b(Context context) {
        a = context.getApplicationContext();
    }

    public static Button c(Dialog dialog, int i) {
        if (dialog instanceof AlertDialog) {
            return ((AlertDialog) dialog).getButton(i);
        }
        if (!(dialog instanceof cv)) {
            return null;
        }
        return ((cv) dialog).b(i);
    }

    public static ListView d(Dialog dialog) {
        if (dialog instanceof AlertDialog) {
            return ((AlertDialog) dialog).getListView();
        }
        if (!(dialog instanceof cv)) {
            return null;
        }
        return ((cv) dialog).c();
    }

    public static void e(ViewGroup viewGroup, int i, List list, qo qoVar, gtf gtfVar) {
        SoftKeyView softKeyView;
        int childCount = viewGroup.getChildCount() - i;
        viewGroup.removeViews(0, childCount);
        int size = list.size();
        HashSet<String> hashSet = new HashSet(qoVar.keySet());
        for (int i2 = 0; i2 < size; i2++) {
            gqh gqhVar = (gqh) list.get(i2);
            hashSet.remove(gqhVar.a);
            gsr gsrVar = (gsr) qoVar.get(gqhVar.a);
            gqh gqhVar2 = null;
            if (gsrVar != null) {
                softKeyView = gsrVar.b;
                if (!gqhVar.equals(gsrVar.a)) {
                    gqhVar2 = gsrVar.a;
                }
            } else {
                softKeyView = null;
            }
            if (gqhVar2 != null) {
                gqhVar2.d();
            }
            if (softKeyView == null) {
                softKeyView = gtfVar.a();
            }
            viewGroup.addView(softKeyView, i2);
            if (gsrVar == null || gqhVar2 != null) {
                qoVar.put(gqhVar.a, gsr.a(gqhVar, softKeyView));
                gtfVar.b(softKeyView, gqhVar);
                gqhVar.e(softKeyView);
            }
        }
        for (String str : hashSet) {
            gsr gsrVar2 = (gsr) qoVar.remove(str);
            if (gsrVar2 != null) {
                gsrVar2.a.d();
            }
        }
    }

    public static int f(int i) {
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
            case 17:
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

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
