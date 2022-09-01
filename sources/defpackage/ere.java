package defpackage;

import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* renamed from: ere  reason: default package */
/* loaded from: classes.dex */
public final class ere implements gyw {
    private final eqm a;
    private final equ b;

    public ere(eqm eqmVar, equ equVar) {
        this.a = eqmVar;
        this.b = equVar;
    }

    @Override // defpackage.gyw
    public final LayoutInflater a(ContextWrapper contextWrapper) {
        return new erd(LayoutInflater.from(contextWrapper.getBaseContext()).cloneInContext(contextWrapper), this.a, this.b);
    }
}
