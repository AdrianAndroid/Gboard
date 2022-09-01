package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: aqh  reason: default package */
/* loaded from: classes.dex */
public final class aqh extends aqf {
    private final Paint h = new anj(3);
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private aoh k;
    private aoh l;

    public aqh(amy amyVar, aqi aqiVar) {
        super(amyVar, aqiVar);
    }

    private final Bitmap p() {
        aow aowVar;
        Bitmap bitmap;
        aoh aohVar = this.l;
        if (aohVar == null || (bitmap = (Bitmap) aohVar.e()) == null) {
            String str = this.c.f;
            amy amyVar = this.b;
            if (amyVar.getCallback() == null) {
                aowVar = null;
            } else {
                aow aowVar2 = amyVar.g;
                if (aowVar2 != null) {
                    Drawable.Callback callback = amyVar.getCallback();
                    Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                    if ((context != null || aowVar2.a != null) && !aowVar2.a.equals(context)) {
                        amyVar.g = null;
                    }
                }
                if (amyVar.g == null) {
                    amyVar.g = new aow(amyVar.getCallback(), amyVar.h, amyVar.a.b);
                }
                aowVar = amyVar.g;
            }
            if (aowVar != null) {
                amz amzVar = (amz) aowVar.c.get(str);
                if (amzVar == null) {
                    return null;
                }
                Bitmap bitmap2 = amzVar.e;
                if (bitmap2 != null) {
                    return bitmap2;
                }
                String str2 = amzVar.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
                    try {
                        if (TextUtils.isEmpty(aowVar.b)) {
                            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                        }
                        try {
                            Bitmap e = ash.e(BitmapFactory.decodeStream(aowVar.a.getAssets().open(aowVar.b + str2), null, options), amzVar.a, amzVar.b);
                            aowVar.a(str, e);
                            return e;
                        } catch (IllegalArgumentException e2) {
                            asa.b("Unable to decode image.", e2);
                            return null;
                        }
                    } catch (IOException e3) {
                        asa.b("Unable to open asset.", e3);
                        return null;
                    }
                }
                try {
                    byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    aowVar.a(str, decodeByteArray);
                    return decodeByteArray;
                } catch (IllegalArgumentException e4) {
                    asa.b("data URL did not have correct base64 format.", e4);
                    return null;
                }
            }
            amp ampVar = amyVar.a;
            amz amzVar2 = ampVar == null ? null : (amz) ampVar.b.get(str);
            if (amzVar2 != null) {
                return amzVar2.e;
            }
            return null;
        }
        return bitmap;
    }

    @Override // defpackage.aqf, defpackage.apa
    public final void a(Object obj, asj asjVar) {
        super.a(obj, asjVar);
        if (obj == and.E) {
            this.k = new aov(asjVar);
        } else if (obj != and.H) {
        } else {
            this.l = new aov(asjVar);
        }
    }

    @Override // defpackage.aqf, defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        Bitmap p = p();
        if (p != null) {
            rectF.set(0.0f, 0.0f, p.getWidth() * ash.a(), p.getHeight() * ash.a());
            this.a.mapRect(rectF);
        }
    }

    @Override // defpackage.aqf
    public final void i(Canvas canvas, Matrix matrix, int i) {
        Bitmap p = p();
        if (p == null || p.isRecycled()) {
            return;
        }
        float a = ash.a();
        this.h.setAlpha(i);
        aoh aohVar = this.k;
        if (aohVar != null) {
            this.h.setColorFilter((ColorFilter) aohVar.e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.i.set(0, 0, p.getWidth(), p.getHeight());
        this.j.set(0, 0, (int) (p.getWidth() * a), (int) (p.getHeight() * a));
        canvas.drawBitmap(p, this.i, this.j, this.h);
        canvas.restore();
    }
}
