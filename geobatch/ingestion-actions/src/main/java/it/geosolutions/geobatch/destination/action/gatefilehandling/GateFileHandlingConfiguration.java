/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.geo-solutions.it/
 *  Copyright (C) 2014 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.geobatch.destination.action.gatefilehandling;

import it.geosolutions.geobatch.destination.action.gateingestion.GateIngestionConfiguration;
import it.geosolutions.geobatch.remoteBrowser.configuration.RemoteBrowserConfiguration;

/**
 * Gate file handling configuration. Not use input ds (input data it's read from xml).
 * Includes ftp connection parameters for the remote file browsing
 * 
 * @author adiaz
 */
public class GateFileHandlingConfiguration extends GateIngestionConfiguration {

/**
 * Configuration for the remote connection for the files to be ingested
 */
private RemoteBrowserConfiguration remoteBrowserConfiguration;

/**
 * Configuration for the remote connection for success or fail executions
 */
private RemoteBrowserConfiguration remoteResultBrowserConfiguration;

/**
 * Pattern for files to be handled
 */
private String filePattern;

/**
 * Flag to don't retry already handled files (by name). Default it's true
 */
private boolean checkIfExists = true;

/**
 * Flag to save on local directory or not. Default it's true. 
 * When false, use {@link GateFileHandlingConfiguration#remoteResultBrowserConfiguration} to store the results
 */
private boolean storeLocal = true;

/**
 * Flag to delete files on the remote server after download it. Default it's false
 */
private boolean deleteDownloadedFiles = false;

/**
 * Base path for the remote input files
 */
private String inputRemotePath;

/**
 * Input directory
 */
private String inputPath;

/**
 * Output for done files
 */
private String succesPath;

/**
 * Output for fail files
 */
private String failPath;

public GateFileHandlingConfiguration(String id, String name, String description) {
    super(id, name, description);
}

/**
 * @return the remoteBrowserConfiguration
 */
public RemoteBrowserConfiguration getRemoteBrowserConfiguration() {
    return remoteBrowserConfiguration;
}

/**
 * @param remoteBrowserConfiguration the remoteBrowserConfiguration to set
 */
public void setRemoteBrowserConfiguration(
        RemoteBrowserConfiguration remoteBrowserConfiguration) {
    this.remoteBrowserConfiguration = remoteBrowserConfiguration;
}

/**
 * @return the remoteResultBrowserConfiguration
 */
public RemoteBrowserConfiguration getRemoteResultBrowserConfiguration() {
    return remoteResultBrowserConfiguration;
}

/**
 * @param remoteResultBrowserConfiguration the remoteResultBrowserConfiguration to set
 */
public void setRemoteResultBrowserConfiguration(
        RemoteBrowserConfiguration remoteResultBrowserConfiguration) {
    this.remoteResultBrowserConfiguration = remoteResultBrowserConfiguration;
}

/**
 * @return the storeLocal
 */
public boolean isStoreLocal() {
    return storeLocal;
}

/**
 * @param storeLocal the storeLocal to set
 */
public void setStoreLocal(boolean storeLocal) {
    this.storeLocal = storeLocal;
}

/**
 * @return the deleteDownloadedFiles
 */
public boolean isDeleteDownloadedFiles() {
    return deleteDownloadedFiles;
}

/**
 * @param deleteDownloadedFiles the deleteDownloadedFiles to set
 */
public void setDeleteDownloadedFiles(boolean deleteDownloadedFiles) {
    this.deleteDownloadedFiles = deleteDownloadedFiles;
}

/**
 * @return the inputRemotePath
 */
public String getInputRemotePath() {
    return inputRemotePath;
}

/**
 * @param inputRemotePath the inputRemotePath to set
 */
public void setInputRemotePath(String inputRemotePath) {
    this.inputRemotePath = inputRemotePath;
}

/**
 * @return the inputPath
 */
public String getInputPath() {
    return inputPath;
}

/**
 * @param inputPath the inputPath to set
 */
public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
}

/**
 * @return the succesPath
 */
public String getSuccesPath() {
    return succesPath;
}

/**
 * @param succesPath the succesPath to set
 */
public void setSuccesPath(String succesPath) {
    this.succesPath = succesPath;
}

/**
 * @return the failPath
 */
public String getFailPath() {
    return failPath;
}

/**
 * @param failPath the failPath to set
 */
public void setFailPath(String failPath) {
    this.failPath = failPath;
}

/**
 * @return the filePattern
 */
public String getFilePattern() {
    return filePattern;
}

/**
 * @param filePattern the filePattern to set
 */
public void setFilePattern(String filePattern) {
    this.filePattern = filePattern;
}

/**
 * @return the checkIfExists
 */
public boolean isCheckIfExists() {
    return checkIfExists;
}

/**
 * @param checkIfExists the checkIfExists to set
 */
public void setCheckIfExists(boolean checkIfExists) {
    this.checkIfExists = checkIfExists;
}

}
