package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hmr  reason: default package */
/* loaded from: classes.dex */
final class hmr extends ArrayList implements gwb {
    public static final xx a = new xz(2);

    public hmr() {
        super(6);
    }

    @Override // defpackage.gwb
    public final void a() {
        int size = size();
        for (int i = 0; i < size; i++) {
            Message message = (Message) get(i);
            hmz.k(message);
            message.recycle();
        }
        clear();
        a.b(this);
    }
}
