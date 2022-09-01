package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmu  reason: default package */
/* loaded from: classes.dex */
public final class cmu implements hwu {
    final /* synthetic */ cmv a;

    public cmu(cmv cmvVar) {
        this.a = cmvVar;
    }

    @Override // defpackage.hwu
    public final void a(ibz ibzVar, ice iceVar, View view) {
        KeyboardViewHolder keyboardViewHolder;
        this.a.e = (ViewGroup) view.findViewById(R.id.key_pos_header_action);
        this.a.f = (SoftKeyView) view.findViewById(lre.aF());
        cmv cmvVar = this.a;
        SoftKeyView softKeyView = cmvVar.f;
        if (softKeyView != null) {
            ViewParent parent = softKeyView.getParent();
            while (true) {
                if (parent == null) {
                    keyboardViewHolder = null;
                    break;
                } else if (!(parent instanceof KeyboardViewHolder)) {
                    parent = parent.getParent();
                } else {
                    keyboardViewHolder = (KeyboardViewHolder) parent;
                    break;
                }
            }
            cmvVar.h = keyboardViewHolder;
            KeyboardViewHolder keyboardViewHolder2 = this.a.h;
            if (keyboardViewHolder2 == null) {
                return;
            }
            Context context = keyboardViewHolder2.getContext();
            this.a.g = LayoutInflater.from(context).inflate(((Long) cmo.x.c()).intValue() != 0 ? R.layout.f134210_resource_name_obfuscated_res_0x7f0e0086 : R.layout.f134190_resource_name_obfuscated_res_0x7f0e0084, (ViewGroup) this.a.h, false);
            cmv cmvVar2 = this.a;
            cmvVar2.i = cmvVar2.g.getPaddingEnd();
            cmv cmvVar3 = this.a;
            cmvVar3.g.setOnClickListener(cmvVar3.d);
            gqa.q(this.a.g, context.getString(R.string.f150940_resource_name_obfuscated_res_0x7f1401d4));
            cmv cmvVar4 = this.a;
            cmvVar4.b.d(cmvVar4.g);
            cmv cmvVar5 = this.a;
            if (cmvVar5.c) {
                cmvVar5.g();
                this.a.b.c();
                return;
            }
            cmvVar5.b.a();
        }
    }

    @Override // defpackage.hwu
    public final void b() {
        cmv cmvVar = this.a;
        cmvVar.e = null;
        cmvVar.e();
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void c(boolean z) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void d(View view) {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void f(ibz ibzVar) {
    }
}
