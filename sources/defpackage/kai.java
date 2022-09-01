package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: kai  reason: default package */
/* loaded from: classes.dex */
public final class kai {
    public final List a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kai(Context context, ihk ihkVar) {
        this.e = new xy(5);
        this.c = new CopyOnWriteArrayList();
        this.a = new CopyOnWriteArrayList();
        this.d = context;
        this.f = ihkVar;
    }

    public final long a(String str) {
        try {
            return ((SimpleDateFormat) this.c).parse(str).getTime();
        } catch (ParseException e) {
            throw new kah("error parsing selection date: ".concat(e.toString()));
        }
    }

    public final void b(String str, String str2, boolean z) {
        if (this.b) {
            ((StringBuilder) this.f).append(" AND ");
        }
        this.b = true;
        StringBuilder sb = (StringBuilder) this.f;
        sb.append("(");
        sb.append(str);
        sb.append(true != z ? " != ?)" : " = ?)");
        this.a.add(str2);
    }

    public final ihj c(int i) {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ihj ihjVar = (ihj) it.next();
            if (ihjVar.a == i) {
                return ihjVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ihk] */
    public final ihj d(MotionEvent motionEvent, int i) {
        ihj ihjVar = (ihj) this.e.a();
        if (ihjVar == null) {
            ihjVar = new ihj((Context) this.d, this.f);
        }
        boolean z = this.b;
        ihjVar.a = motionEvent.getPointerId(i);
        ihjVar.b = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        ihjVar.c = y;
        ihjVar.d = ihjVar.b;
        ihjVar.e = y;
        ihjVar.f = motionEvent.getPressure(i);
        ihjVar.g = ihj.O(motionEvent);
        ihjVar.h = ihj.P(motionEvent);
        ihjVar.s = ihjVar.f().o();
        ihjVar.C.b();
        ihjVar.t = 60L;
        if (z) {
            ihjVar.v = motionEvent.getEventTime();
            ihjVar.u = new ArrayList();
            ihjVar.u.add(new ici(motionEvent, i, ihjVar.v));
        } else {
            ihjVar.u = null;
        }
        ((CopyOnWriteArrayList) this.c).add(ihjVar);
        return ihjVar;
    }

    public final void e() {
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((ihj) it.next()).z(0L);
        }
    }

    public kai(jzx jzxVar) {
        this.c = new SimpleDateFormat("yyyyMMdd", Locale.US);
        this.b = false;
        this.d = jzxVar;
        this.f = new StringBuilder();
        this.a = new ArrayList();
        this.e = "selection_hint";
    }
}
