package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: dwe  reason: default package */
/* loaded from: classes.dex */
public final class dwe implements dwj {
    public final /* synthetic */ dwf a;
    public final int b;
    private final int c;
    private final bkr d;
    private final int e;

    public dwe(dwf dwfVar, int i, bkr bkrVar, int i2, int i3) {
        this.a = dwfVar;
        this.c = i;
        this.d = bkrVar;
        this.e = i2;
        this.b = i3;
    }

    @Override // defpackage.dwj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dwj
    public final Optional b() {
        ney neyVar = this.d.c;
        return neyVar != null ? Optional.of(neyVar) : Optional.empty();
    }

    @Override // defpackage.dwj
    public final void c(dwk dwkVar, View view, Context context) {
        view.setOnClickListener(new bsx(this, dwkVar, 14));
        ((AppCompatTextView) view.findViewById(R.id.f66560_resource_name_obfuscated_res_0x7f0b07f9)).setText(dxf.b(context).a(this.d.a));
    }

    @Override // defpackage.dwj
    public final void e() {
    }

    @Override // defpackage.dwj
    public final void f() {
        this.a.b(this.e);
    }

    @Override // defpackage.dwj
    public final void g() {
    }
}
