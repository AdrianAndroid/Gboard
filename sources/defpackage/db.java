package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: db  reason: default package */
/* loaded from: classes.dex */
public final class db implements yy {
    final /* synthetic */ dr a;

    public db(dr drVar) {
        this.a = drVar;
    }

    @Override // defpackage.yy
    public final abc a(View view, abc abcVar) {
        boolean z;
        aau aarVar;
        boolean z2;
        int a;
        abc abcVar2 = abcVar;
        int d = abcVar.d();
        dr drVar = this.a;
        int d2 = abcVar.d();
        ActionBarContextView actionBarContextView = drVar.s;
        int i = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) drVar.s.getLayoutParams();
            if (drVar.s.isShown()) {
                if (drVar.L == null) {
                    drVar.L = new Rect();
                    drVar.M = new Rect();
                }
                Rect rect = drVar.L;
                Rect rect2 = drVar.M;
                rect.set(abcVar.b(), abcVar.d(), abcVar.c(), abcVar.a());
                ViewGroup viewGroup = drVar.x;
                Method method = oi.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                abc x = aad.x(drVar.x);
                int b = x == null ? 0 : x.b();
                int c = x == null ? 0 : x.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && drVar.y == null) {
                    drVar.y = new View(drVar.l);
                    drVar.y.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    drVar.x.addView(drVar.y, -1, layoutParams);
                } else {
                    View view2 = drVar.y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            drVar.y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = drVar.y;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = drVar.y;
                    if ((aad.l(view4) & 8192) != 0) {
                        a = us.a(drVar.l, R.color.f20740_resource_name_obfuscated_res_0x7f06000b);
                    } else {
                        a = us.a(drVar.l, R.color.f20730_resource_name_obfuscated_res_0x7f06000a);
                    }
                    view4.setBackgroundColor(a);
                }
                if (!drVar.B && z) {
                    d2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                drVar.s.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = drVar.y;
        if (view5 != null) {
            if (true == z) {
                i = 0;
            }
            view5.setVisibility(i);
        }
        if (d != d2) {
            int b2 = abcVar.b();
            int c2 = abcVar.c();
            int a2 = abcVar.a();
            if (Build.VERSION.SDK_INT >= 30) {
                aarVar = new aat(abcVar2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                aarVar = new aas(abcVar2);
            } else {
                aarVar = new aar(abcVar2);
            }
            aarVar.c(vq.d(b2, d2, c2, a2));
            abcVar2 = aarVar.a();
        }
        return aad.y(view, abcVar2);
    }
}
