package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboardmode.KeyboardSideFrame;
import com.google.android.libraries.inputmethod.keyboardmode.MultiTouchDelegateView;

/* compiled from: PG */
/* renamed from: hvr  reason: default package */
/* loaded from: classes.dex */
public final class hvr implements View.OnClickListener {
    final /* synthetic */ View a;
    final /* synthetic */ KeyboardSideFrame b;

    public hvr(KeyboardSideFrame keyboardSideFrame, View view) {
        this.b = keyboardSideFrame;
        this.a = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hwj hwjVar = this.b.a;
        if (hwjVar != null) {
            hwg hwgVar = hwjVar.c;
            View view2 = hwjVar.g;
            Rect q = hwjVar.e.q();
            imn imnVar = hwgVar.u;
            if (imnVar != null && view2 != null) {
                hwgVar.v = q;
                hwgVar.w = hwjVar;
                if (hwgVar.c == null) {
                    hwgVar.c = imnVar.a(R.layout.f135420_resource_name_obfuscated_res_0x7f0e010a);
                    hwgVar.f = (MultiTouchDelegateView) hwgVar.c.findViewById(R.id.f59080_resource_name_obfuscated_res_0x7f0b04cb);
                    hwgVar.i = hwgVar.c.findViewById(R.id.f59090_resource_name_obfuscated_res_0x7f0b04cc);
                    hwgVar.r = hwgVar.i.findViewById(R.id.f54480_resource_name_obfuscated_res_0x7f0b01a6);
                    hwgVar.s = hwgVar.i.findViewById(R.id.f65970_resource_name_obfuscated_res_0x7f0b07ae);
                    hwgVar.t = hwgVar.i.findViewById(R.id.f67800_resource_name_obfuscated_res_0x7f0b0890);
                    hwgVar.j = hwgVar.i.findViewById(R.id.f59150_resource_name_obfuscated_res_0x7f0b04d2);
                    hwgVar.k = hwgVar.i.findViewById(R.id.f59170_resource_name_obfuscated_res_0x7f0b04d4);
                    hwgVar.l = hwgVar.i.findViewById(R.id.f59160_resource_name_obfuscated_res_0x7f0b04d3);
                    hwgVar.m = hwgVar.i.findViewById(R.id.f59140_resource_name_obfuscated_res_0x7f0b04d1);
                    hwgVar.n = hwgVar.i.findViewById(R.id.f59100_resource_name_obfuscated_res_0x7f0b04cd);
                    hwgVar.o = hwgVar.i.findViewById(R.id.f59110_resource_name_obfuscated_res_0x7f0b04ce);
                    hwgVar.p = hwgVar.i.findViewById(R.id.f59120_resource_name_obfuscated_res_0x7f0b04cf);
                    hwgVar.q = hwgVar.i.findViewById(R.id.f59130_resource_name_obfuscated_res_0x7f0b04d0);
                    View view3 = hwgVar.c;
                    if (view3 != null) {
                        view3.setEnabled(true);
                        hwgVar.c.setOnTouchListener(hwgVar.E);
                    }
                    View view4 = hwgVar.i;
                    if (view4 != null) {
                        view4.addOnLayoutChangeListener(hwgVar.C);
                        hwgVar.i.setOnTouchListener(hwgVar.F);
                    }
                    MultiTouchDelegateView multiTouchDelegateView = hwgVar.f;
                    if (multiTouchDelegateView != null) {
                        multiTouchDelegateView.setOnHoverListener(new btz(6));
                    }
                    if (hwgVar.n != null) {
                        hwf hwfVar = new hwf(hwgVar);
                        hwfVar.a(1, 1);
                        hwgVar.n.setOnTouchListener(hwfVar);
                    }
                    if (hwgVar.o != null) {
                        hwf hwfVar2 = new hwf(hwgVar);
                        hwfVar2.a(1, 0);
                        hwgVar.o.setOnTouchListener(hwfVar2);
                    }
                    if (hwgVar.p != null) {
                        hwf hwfVar3 = new hwf(hwgVar);
                        hwfVar3.a(0, 1);
                        hwgVar.p.setOnTouchListener(hwfVar3);
                    }
                    if (hwgVar.q != null) {
                        hwf hwfVar4 = new hwf(hwgVar);
                        hwfVar4.a(0, 0);
                        hwgVar.q.setOnTouchListener(hwfVar4);
                    }
                    View view5 = hwgVar.r;
                    if (view5 != null) {
                        view5.setOnClickListener(new hwd(hwgVar, 0));
                    }
                    View view6 = hwgVar.t;
                    if (view6 != null) {
                        view6.setOnClickListener(new hwd(hwgVar, 1));
                    }
                    hwgVar.h(true);
                }
                if (hwgVar.c != null) {
                    hwgVar.b = true;
                    View view7 = hwgVar.a;
                    if (view2 != view7) {
                        hwgVar.a = view2;
                        if (view7 != null) {
                            view7.removeOnLayoutChangeListener(hwgVar.G);
                            view7.removeCallbacks(hwgVar.H);
                        }
                        view2.addOnLayoutChangeListener(hwgVar.G);
                    }
                    View view8 = hwgVar.c;
                    if (view8 != null) {
                        hwgVar.u.e(view8, view2, 0, 0, 0, null);
                        hwgVar.c.getLocationOnScreen(hwgVar.d);
                        View view9 = hwgVar.h;
                        if (view9 != null) {
                            jdy.j(view9, hwgVar.e);
                        }
                    }
                    hwgVar.i();
                }
            }
            hwjVar.b.g(R.string.f166340_resource_name_obfuscated_res_0x7f1408d0, new Object[0]);
            hwjVar.a.e(hvq.KEYBOARD_RESIZE_REPOSITION_ACTIVATED, new Object[0]);
            jdm jdmVar = hwjVar.h.f.t;
            if (jdmVar != null) {
                jdmVar.setVisibility(8);
            }
            this.a.performAccessibilityAction(128, null);
        }
    }
}
