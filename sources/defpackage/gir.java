package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.avatar.creation.CreateAvatarActivity;

/* compiled from: PG */
/* renamed from: gir  reason: default package */
/* loaded from: classes.dex */
public class gir extends an {
    public CreateAvatarActivity a;

    public boolean a() {
        throw null;
    }

    @Override // defpackage.an
    public final void fX(Context context) {
        super.fX(context);
        this.a = (CreateAvatarActivity) context;
        try {
            giw.b();
            throw null;
        } catch (gin e) {
            Log.w("CreateAvatarFragment", "Unable to create fragment.", e);
            B().finish();
        }
    }
}
