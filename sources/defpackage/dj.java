package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;
import java.util.List;

/* compiled from: PG */
/* renamed from: dj  reason: default package */
/* loaded from: classes.dex */
public final class dj extends fz {
    public boolean a;
    public boolean b;
    final /* synthetic */ dr c;
    public opu d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(dr drVar, Window.Callback callback) {
        super(callback);
        this.c = drVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent) : this.c.M(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            dr drVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            cm b = drVar.b();
            if (b == null || !b.n(keyCode, keyEvent)) {
                dp dpVar = drVar.E;
                if (dpVar == null || !drVar.U(dpVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (drVar.E == null) {
                        dp T = drVar.T(0);
                        drVar.O(T, keyEvent);
                        boolean U = drVar.U(T, keyEvent.getKeyCode(), keyEvent);
                        T.k = false;
                        if (!U) {
                        }
                    }
                    return false;
                }
                dp dpVar2 = drVar.E;
                if (dpVar2 != null) {
                    dpVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof gm)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        int i2;
        View view;
        opu opuVar = this.d;
        if (opuVar != null) {
            if (i == 0) {
                view = new View(((eb) opuVar.a).a.b());
                i2 = 0;
            } else {
                i2 = i;
                view = null;
            }
            if (view != null) {
                return view;
            }
            i = i2;
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        cm b;
        super.onMenuOpened(i, menu);
        dr drVar = this.c;
        if (i == 108 && (b = drVar.b()) != null) {
            b.d(true);
        }
        return true;
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        dr drVar = this.c;
        if (i == 108) {
            cm b = drVar.b();
            if (b == null) {
                return;
            }
            b.d(false);
        } else if (i != 0) {
        } else {
            dp T = drVar.T(0);
            if (!T.m) {
                return;
            }
            drVar.G(T, false);
        }
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        gm gmVar = menu instanceof gm ? (gm) menu : null;
        if (i == 0) {
            if (gmVar == null) {
                return false;
            }
            i = 0;
        }
        if (gmVar != null) {
            gmVar.i = true;
        }
        opu opuVar = this.d;
        if (opuVar != null && i == 0) {
            eb ebVar = (eb) opuVar.a;
            if (!ebVar.c) {
                ebVar.a.j();
                ((eb) opuVar.a).c = true;
            }
            i = 0;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (gmVar != null) {
            gmVar.i = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        gm gmVar = this.c.T(0).h;
        if (gmVar == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, gmVar, i);
        }
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.fz, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Context context;
        dr drVar = this.c;
        if (!drVar.v || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        fp fpVar = new fp(drVar.l, callback);
        dr drVar2 = this.c;
        fm fmVar = drVar2.r;
        if (fmVar != null) {
            fmVar.f();
        }
        fl dfVar = new df(drVar2, fpVar);
        cm b = drVar2.b();
        if (b != null) {
            drVar2.r = b.c(dfVar);
        }
        fm fmVar2 = drVar2.r;
        if (fmVar2 == null) {
            drVar2.I();
            fm fmVar3 = drVar2.r;
            if (fmVar3 != null) {
                fmVar3.f();
            }
            if (drVar2.s == null) {
                if (drVar2.C) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = drVar2.l.getTheme();
                    theme.resolveAttribute(R.attr.f7410_resource_name_obfuscated_res_0x7f04021b, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = drVar2.l.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new po(drVar2.l, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = drVar2.l;
                    }
                    drVar2.s = new ActionBarContextView(context);
                    drVar2.t = new PopupWindow(context, (AttributeSet) null, (int) R.attr.f7560_resource_name_obfuscated_res_0x7f04022a);
                    aco.c(drVar2.t, 2);
                    drVar2.t.setContentView(drVar2.s);
                    drVar2.t.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.f7350_resource_name_obfuscated_res_0x7f040215, typedValue, true);
                    drVar2.s.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    drVar2.t.setHeight(-2);
                    drVar2.u = new az(drVar2, 5);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) drVar2.x.findViewById(R.id.f52170_resource_name_obfuscated_res_0x7f0b005c);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(drVar2.y());
                        drVar2.s = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (drVar2.s != null) {
                drVar2.I();
                drVar2.s.i();
                fo foVar = new fo(drVar2.s.getContext(), drVar2.s, dfVar);
                if (dfVar.c(foVar, foVar.a)) {
                    foVar.g();
                    drVar2.s.h(foVar);
                    drVar2.r = foVar;
                    if (drVar2.P()) {
                        drVar2.s.setAlpha(0.0f);
                        aqq aq = aad.aq(drVar2.s);
                        aq.j(1.0f);
                        drVar2.N = aq;
                        drVar2.N.l(new dd(drVar2));
                    } else {
                        drVar2.s.setAlpha(1.0f);
                        drVar2.s.setVisibility(0);
                        if (drVar2.s.getParent() instanceof View) {
                            aad.K((View) drVar2.s.getParent());
                        }
                    }
                    if (drVar2.t != null) {
                        drVar2.m.getDecorView().post(drVar2.u);
                    }
                } else {
                    drVar2.r = null;
                }
            }
            fmVar2 = drVar2.r;
        }
        if (fmVar2 == null) {
            return null;
        }
        return fpVar.e(fmVar2);
    }
}
