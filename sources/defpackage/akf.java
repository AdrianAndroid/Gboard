package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: akf  reason: default package */
/* loaded from: classes.dex */
public final class akf extends akh implements Animatable {
    public final akc a;
    public Animator.AnimatorListener b;
    public ArrayList c;
    final Drawable.Callback d;
    private final Context f;

    public akf() {
        this(null, null);
    }

    public static akf a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            akf akfVar = new akf(context);
            Drawable e = vm.e(context.getResources(), i, context.getTheme());
            e.setCallback(akfVar.d);
            new akd(e.getConstantState());
            akfVar.e = e;
            return akfVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return b(context, context.getResources(), xml, asAttributeSet, context.getTheme());
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (IOException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("AnimatedVDCompat", "parser error", e3);
            return null;
        }
    }

    public static akf b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        akf akfVar = new akf(context);
        akfVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return akfVar;
    }

    @Override // defpackage.akh, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.b(drawable, theme);
        }
    }

    public final void c(ajz ajzVar) {
        if (ajzVar == null) {
            return;
        }
        Drawable drawable = this.e;
        if (drawable != null) {
            ake.b((AnimatedVectorDrawable) drawable, ajzVar.a());
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.c.contains(ajzVar)) {
            return;
        }
        this.c.add(ajzVar);
        if (this.b == null) {
            this.b = new akb(this);
        }
        this.a.c.addListener(this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return wf.i(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.a.b.draw(canvas);
        if (!this.a.c.isStarted()) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? we.a(drawable) : this.a.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.a.a;
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? wf.a(drawable) : this.a.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new akd(this.e.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.a.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.a.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getOpacity() : this.a.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? we.e(drawable) : this.a.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.a.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isStateful() : this.a.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // defpackage.akh, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.a.b.setBounds(rect);
        }
    }

    @Override // defpackage.akh, android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setLevel(i) : this.a.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setState(iArr) : this.a.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.a.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            we.d(drawable, z);
        } else {
            this.a.b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.a.b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.f(drawable, i);
        } else {
            this.a.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.g(drawable, colorStateList);
        } else {
            this.a.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.h(drawable, mode);
        } else {
            this.a.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.a.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.a.c.isStarted()) {
        } else {
            this.a.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.a.c.end();
        }
    }

    private akf(Context context) {
        this(context, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator j;
        akp c;
        Drawable drawable = this.e;
        if (drawable != null) {
            wf.c(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray g = jn.g(resources, theme, attributeSet, ajx.e);
                    int resourceId = g.getResourceId(0, 0);
                    if (resourceId != 0) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            c = new akp();
                            c.e = vm.e(resources, resourceId, theme);
                        } else {
                            c = akp.c(resources, resourceId, theme);
                        }
                        nd.c(c, "Failed to load drawable");
                        c.c = false;
                        c.setCallback(this.d);
                        akp akpVar = this.a.b;
                        if (akpVar != null) {
                            akpVar.setCallback(null);
                        }
                        this.a.b = c;
                    }
                    g.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, ajx.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                j = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                j = wf.j(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            j.setTarget(this.a.b.b.b.l.get(string));
                            akc akcVar = this.a;
                            if (akcVar.d == null) {
                                akcVar.d = new ArrayList();
                                this.a.e = new qo();
                            }
                            this.a.d.add(j);
                            this.a.e.put(j, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        akc akcVar2 = this.a;
        if (akcVar2.c == null) {
            akcVar2.c = new AnimatorSet();
        }
        akcVar2.c.playTogether(akcVar2.d);
    }

    private akf(Context context, byte[] bArr) {
        this.b = null;
        this.c = null;
        this.d = new aka(this);
        this.f = context;
        this.a = new akc();
    }
}
