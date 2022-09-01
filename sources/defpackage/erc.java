package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* renamed from: erc  reason: default package */
/* loaded from: classes.dex */
public final class erc extends ContextWrapper {
    private final equ a;
    private erd b;

    public erc(Context context, equ equVar) {
        super(context);
        this.a = equVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        erd erdVar;
        if ("layout_inflater".equals(str)) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new erd((LayoutInflater) super.getSystemService(str), this.a);
                }
                erdVar = this.b;
            }
            return erdVar;
        }
        return super.getSystemService(str);
    }
}
