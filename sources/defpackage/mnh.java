package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: mnh  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class mnh implements moi {
    private final /* synthetic */ int c;
    public static final /* synthetic */ mnh b = new mnh(1);
    public static final /* synthetic */ mnh a = new mnh(0);

    private /* synthetic */ mnh(int i) {
        this.c = i;
    }

    @Override // defpackage.moi
    public final Object a() {
        if (this.c != 0) {
            return Collections.emptySet();
        }
        return null;
    }
}
