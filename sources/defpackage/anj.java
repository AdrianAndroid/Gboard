package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: PG */
/* renamed from: anj  reason: default package */
/* loaded from: classes.dex */
public final class anj extends Paint {
    public anj() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public anj(int i) {
        super(i);
    }

    public anj(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public anj(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }
}
