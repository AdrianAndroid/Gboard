package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: PG */
/* renamed from: po  reason: default package */
/* loaded from: classes2.dex */
public final class po extends ContextWrapper {
    public int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public po() {
        super(null);
    }

    private final Resources b() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.e = super.getResources();
            } else {
                this.e = pn.a(this, configuration).getResources();
            }
        }
        return this.e;
    }

    private final void c() {
        if (this.b == null) {
            this.b = b().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final void a(Configuration configuration) {
        if (this.e == null) {
            if (this.d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            this.d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return b().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2132084311;
        }
        c();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public po(Context context, int i) {
        super(context);
        this.a = i;
    }

    public po(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
