package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: aec  reason: default package */
/* loaded from: classes.dex */
public final class aec implements TextWatcher {
    public int a = Integer.MAX_VALUE;
    public int b = 0;
    private final EditText c;
    private us d;

    public aec(EditText editText) {
        this.c = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.c.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int a = adq.b().a();
            if (a != 0) {
                if (a == 1) {
                    adq.b().c((Spannable) charSequence, i, i + i3, this.a, this.b);
                    return;
                } else if (a != 3) {
                    return;
                }
            }
            adq b = adq.b();
            if (this.d == null) {
                this.d = new aeb(this.c);
            }
            us usVar = this.d;
            nq.h(usVar, "initCallback cannot be null");
            b.c.writeLock().lock();
            try {
                int i4 = b.e;
                if (i4 != 1 && i4 != 2) {
                    b.d.add(usVar);
                }
                Handler handler = b.f;
                nq.h(usVar, "initCallback cannot be null");
                handler.post(new amh(Arrays.asList(usVar), i4, 1));
            } finally {
                b.c.writeLock().unlock();
            }
        }
    }
}
