package defpackage;

/* compiled from: PG */
/* renamed from: fff  reason: default package */
/* loaded from: classes.dex */
public enum fff {
    UNKNOWN(false),
    TIMEOUT(true),
    USER_TERMINATED(false),
    RECOGNITION_ERROR(true),
    RECOGNITION_NETWORK_ERROR(true),
    RECOGNITION_AUDIO_ERROR(true),
    INITIALIZATION_ERROR(true),
    OTHER(false);
    
    public final boolean i;

    fff(boolean z) {
        this.i = z;
    }
}
