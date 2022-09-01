package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gzm  reason: default package */
/* loaded from: classes.dex */
public class gzm {
    private static final long a = TimeUnit.HOURS.toMillis(24);
    public static final /* synthetic */ int f = 0;
    public final Context c;
    public final int d;
    public final hqy e;

    public gzm(Context context, int i) {
        this.c = context;
        this.e = hrx.y(context);
        this.d = i;
    }

    public static void m(hqy hqyVar, Context context) {
        hqyVar.j(context, -1, null);
    }

    public static void n(Window window, IBinder iBinder, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.token = iBinder;
        attributes.width = window.getWindowManager().getDefaultDisplay().getWidth();
        attributes.height = i;
        attributes.type = 1003;
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setAttributes(attributes);
        window.addFlags(131072);
    }

    public static final int p(String str) {
        gzh a2 = gzp.a(str);
        if (a2 == null || (a2.a & 1) == 0) {
            return 0;
        }
        return a2.d;
    }

    public static int q(Context context, long j, int i, int i2, int i3) {
        long h = jam.h(context);
        return h > -1 ? j - h >= a ? i2 : i : i3;
    }

    public static void r(Context context, int i) {
        ino M = ino.M(context);
        int i2 = i - 1;
        if (i != 0) {
            M.h("ime_select_reason", i2);
            return;
        }
        throw null;
    }

    public void b(Collection collection, int i) {
        this.e.i(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iin.p(this.c, (hqt) it.next(), i);
        }
    }

    public final llp k(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(Collections.singleton(null));
        llp b = hqr.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hqt hqtVar = (hqt) it.next();
            jav i = hqtVar.i();
            String p = hqtVar.p();
            int size = b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    hqt hqtVar2 = (hqt) b.get(i2);
                    i2++;
                    if (!i.equals(hqtVar2.i()) ? false : p.equals(hqtVar2.p())) {
                        arrayList.remove(hqtVar);
                        break;
                    }
                }
            }
        }
        return llp.o(arrayList);
    }

    public final mko l(String str) {
        mko e;
        ArrayList arrayList = new ArrayList();
        gzh a2 = gzp.a(str);
        llp o = a2 != null ? llp.o(a2.b) : null;
        if (o != null) {
            int size = o.size();
            for (int i = 0; i < size; i++) {
                gzi gziVar = (gzi) o.get(i);
                String str2 = gziVar.b;
                String str3 = gziVar.c;
                if (TextUtils.isEmpty(str3)) {
                    e = this.e.c(jav.f(str2));
                } else {
                    e = this.e.e(jav.f(str2), str3);
                }
                arrayList.add(e);
            }
        }
        return mio.g(kcu.G(arrayList), fxd.r, mjl.a);
    }

    public final void o(LinkableTextView linkableTextView) {
        linkableTextView.a = new bwd(this, 7);
    }
}
