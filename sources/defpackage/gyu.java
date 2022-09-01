package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: gyu  reason: default package */
/* loaded from: classes.dex */
public final class gyu extends gyx {
    private final isu a;
    private final lgb b;
    private final String c;

    public gyu(Context context, String str, ist istVar, gyw gywVar) {
        super(context);
        this.c = str;
        this.a = new isu(context, istVar);
        this.b = jdg.n(new buf(this, gywVar, 5));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return this.b.a();
        }
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        return this.a.a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
    }

    public final String toString() {
        return String.format("%s(%s)", super.toString(), this.c);
    }
}
