package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: dvv  reason: default package */
/* loaded from: classes.dex */
public final class dvv implements dwj {
    public final dwh a;
    public dwk b;
    public String c;
    private Context d;
    private AppCompatTextView e;
    private dxf f;

    public dvv(dwh dwhVar) {
        this.a = dwhVar;
    }

    @Override // defpackage.dwj
    public final int a() {
        return R.layout.f143660_resource_name_obfuscated_res_0x7f0e047e;
    }

    @Override // defpackage.dwj
    public final /* synthetic */ Optional b() {
        return Optional.empty();
    }

    @Override // defpackage.dwj
    public final void c(dwk dwkVar, View view, Context context) {
        this.b = dwkVar;
        this.d = context;
        view.findViewById(R.id.f66200_resource_name_obfuscated_res_0x7f0b07d5).setOnClickListener(new cjr(this, 17));
        this.e = (AppCompatTextView) view.findViewById(R.id.f66210_resource_name_obfuscated_res_0x7f0b07d6);
        this.f = dxf.b(context);
        d();
    }

    public final void d() {
        AppCompatTextView appCompatTextView;
        dxf dxfVar;
        String str;
        if (this.d == null || (appCompatTextView = this.e) == null || (dxfVar = this.f) == null || (str = this.c) == null) {
            return;
        }
        appCompatTextView.setText(dxfVar.a(str));
    }

    @Override // defpackage.dwj
    public final void e() {
        this.e = null;
        this.f = null;
        this.b = null;
    }

    @Override // defpackage.dwj
    public final void f() {
    }

    @Override // defpackage.dwj
    public final void g() {
    }
}
