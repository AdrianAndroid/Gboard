package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: cx  reason: default package */
/* loaded from: classes.dex */
public class cx extends ap implements un {
    private da k;

    public cx() {
        J().b("androidx:appcompat", new ax(this, 2));
        j(new cw(this, 0));
    }

    private final void l() {
        vl.b(getWindow().getDecorView(), this);
        vp.b(getWindow().getDecorView(), this);
        vr.b(getWindow().getDecorView(), this);
    }

    @Override // defpackage.ow, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        h().e(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        dr drVar = (dr) h();
        drVar.F = true;
        int x = drVar.x(context, drVar.w());
        if (dr.p(context)) {
            dr.o(context);
        }
        wu C = drVar.C(context);
        if (dr.j && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(drVar.z(context, x, C, null));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof po) {
            try {
                ((po) context).a(drVar.z(context, x, C, null));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (dr.i) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                    if (configuration3.fontScale != configuration4.fontScale) {
                        configuration.fontScale = configuration4.fontScale;
                    }
                    if (configuration3.mcc != configuration4.mcc) {
                        configuration.mcc = configuration4.mcc;
                    }
                    if (configuration3.mnc != configuration4.mnc) {
                        configuration.mnc = configuration4.mnc;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        di.x(configuration3, configuration4, configuration);
                    } else if (!xu.b(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    if (configuration3.touchscreen != configuration4.touchscreen) {
                        configuration.touchscreen = configuration4.touchscreen;
                    }
                    if (configuration3.keyboard != configuration4.keyboard) {
                        configuration.keyboard = configuration4.keyboard;
                    }
                    if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                        configuration.keyboardHidden = configuration4.keyboardHidden;
                    }
                    if (configuration3.navigation != configuration4.navigation) {
                        configuration.navigation = configuration4.navigation;
                    }
                    if (configuration3.navigationHidden != configuration4.navigationHidden) {
                        configuration.navigationHidden = configuration4.navigationHidden;
                    }
                    if (configuration3.orientation != configuration4.orientation) {
                        configuration.orientation = configuration4.orientation;
                    }
                    if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                        configuration.screenLayout |= configuration4.screenLayout & 15;
                    }
                    if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                        configuration.screenLayout |= configuration4.screenLayout & 192;
                    }
                    if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                        configuration.screenLayout |= configuration4.screenLayout & 48;
                    }
                    if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                        configuration.screenLayout |= configuration4.screenLayout & 768;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode |= configuration4.colorMode & 3;
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode |= configuration4.colorMode & 12;
                        }
                    }
                    if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                        configuration.uiMode |= configuration4.uiMode & 15;
                    }
                    if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                        configuration.uiMode |= configuration4.uiMode & 48;
                    }
                    if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                        configuration.screenWidthDp = configuration4.screenWidthDp;
                    }
                    if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                        configuration.screenHeightDp = configuration4.screenHeightDp;
                    }
                    if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                    }
                    if (configuration3.densityDpi != configuration4.densityDpi) {
                        configuration.densityDpi = configuration4.densityDpi;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration z = drVar.z(context, x, C, configuration);
            po poVar = new po(context, 2132084310);
            poVar.a(z);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = poVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        vl.a(theme);
                    } else {
                        synchronized (vk.a) {
                            if (!vk.c) {
                                try {
                                    vk.b = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    vk.b.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                vk.c = true;
                            }
                            Method method = vk.b;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    vk.b = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = poVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        cm g = g();
        if (getWindow().hasFeature(0)) {
            if (g != null && g.k()) {
                return;
            }
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.cc, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        cm g = g();
        if (keyCode != 82 || g == null || !g.o(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // defpackage.un
    public final Intent f() {
        return je.c(this);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return h().c(i);
    }

    public final cm g() {
        return h().b();
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        dr drVar = (dr) h();
        if (drVar.p == null) {
            drVar.K();
            cm cmVar = drVar.o;
            drVar.p = new ft(cmVar != null ? cmVar.b() : drVar.l);
        }
        return drVar.p;
    }

    public final da h() {
        if (this.k == null) {
            this.k = da.u(this);
        }
        return this.k;
    }

    @Override // defpackage.ap
    public final void hA() {
        h().g();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        h().g();
    }

    @Override // defpackage.ap, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        cm b;
        super.onConfigurationChanged(configuration);
        dr drVar = (dr) h();
        if (drVar.z && drVar.w && (b = drVar.b()) != null) {
            b.q();
        }
        C0000if.d().e(drVar.l);
        drVar.H = new Configuration(drVar.l.getResources().getConfiguration());
        drVar.W(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ap, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent c;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        cm g = g();
        if (menuItem.getItemId() != 16908332 || g == null || (g.a() & 4) == 0 || (c = je.c(this)) == null) {
            return false;
        }
        if (!ue.c(this, c)) {
            ue.b(this, c);
            return true;
        }
        uo uoVar = new uo(this);
        Intent f = f();
        if (f == null) {
            f = je.c(this);
        }
        if (f != null) {
            ComponentName component = f.getComponent();
            if (component == null) {
                component = f.resolveActivity(uoVar.b.getPackageManager());
            }
            int size = uoVar.a.size();
            try {
                for (Intent d = je.d(uoVar.b, component); d != null; d = je.d(uoVar.b, d.getComponent())) {
                    uoVar.a.add(size, d);
                }
                uoVar.a.add(f);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        if (uoVar.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) uoVar.a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        up.a(uoVar.b, intentArr, null);
        try {
            tv.a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((dr) h()).J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        cm b = ((dr) h()).b();
        if (b != null) {
            b.h(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public void onStart() {
        super.onStart();
        ((dr) h()).W(true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ap, android.app.Activity
    public void onStop() {
        super.onStop();
        h().i();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().n(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        cm g = g();
        if (getWindow().hasFeature(0)) {
            if (g != null && g.p()) {
                return;
            }
            super.openOptionsMenu();
        }
    }

    @Override // defpackage.ow, android.app.Activity
    public void setContentView(int i) {
        l();
        h().k(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((dr) h()).I = i;
    }

    @Override // defpackage.ow, android.app.Activity
    public final void setContentView(View view) {
        l();
        h().l(view);
    }

    @Override // defpackage.ow, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        h().m(view, layoutParams);
    }
}
