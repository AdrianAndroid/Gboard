package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;

/* compiled from: PG */
/* renamed from: bbz  reason: default package */
/* loaded from: classes.dex */
public final class bbz implements avc {
    public static final auz a = auz.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new bbu(1, null));
    public static final auz b = auz.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new bbu(0));
    private final bbx c;
    private final axp d;

    public bbz(axp axpVar, bbx bbxVar) {
        this.d = axpVar;
        this.c = bbxVar;
    }

    @Override // defpackage.avc
    public final axh a(Object obj, int i, int i2, ava avaVar) {
        long longValue = ((Long) avaVar.b(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) avaVar.b(b);
            if (num == null) {
                num = 2;
            }
            bbb bbbVar = (bbb) avaVar.b(bbb.f);
            if (bbbVar == null) {
                bbbVar = bbb.e;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.c.a(mediaMetadataRetriever, obj);
                int intValue = num.intValue();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT >= 27 && i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && bbbVar != bbb.d) {
                    try {
                        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                        if (parseInt3 == 90 || parseInt3 == 270) {
                            parseInt2 = parseInt;
                            parseInt = parseInt2;
                        }
                        float a2 = bbbVar.a(parseInt, parseInt2, i, i2);
                        bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(parseInt * a2), Math.round(a2 * parseInt2));
                    } catch (Throwable unused) {
                    }
                }
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                if (bitmap == null) {
                    throw new bby();
                }
                return bbn.g(bitmap, this.d);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        }
        throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
    }

    @Override // defpackage.avc
    public final boolean b(Object obj, ava avaVar) {
        return true;
    }
}
