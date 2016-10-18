/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.part;

import org.eclipse.che.ide.api.outputconsole.OutputConsole;
import org.eclipse.che.ide.api.parts.PartPresenter;

/**
 * Part with view for managing processes.
 *
 * @author Roman Nikitenko
 */
public interface ProcessesPart extends PartPresenter {

    /** Opens new terminal for the selected machine. */
    void newTerminal();

    /**
     * Adds command node to process tree and displays command output
     *
     * @param machineId
     *         id of machine in which the command will be executed
     * @param outputConsole
     *         the console for command output
     */
    void addCommandOutput(String machineId, OutputConsole outputConsole);
}
